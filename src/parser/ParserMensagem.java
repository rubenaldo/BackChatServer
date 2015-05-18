/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;


import modelo.Mensagem;
import modelo.Sala;
import modelo.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author adm
 */
public class ParserMensagem {
    
    public String parserMensagemString(Mensagem mens) {
        JSONObject obj = new JSONObject();
        obj.put("id", mens.getId());
        obj.put("mensagem", mens.getMensagem());
        obj.put("usuario_id", mens.getUsuario().getId());
        obj.put("usuario_nome", mens.getUsuario().getNome());
        obj.put("usuario_senha", mens.getUsuario().getSenha());
        obj.put("sala_id", mens.getSala().getId());
        obj.put("sala_nome", mens.getSala().getNome());
        
        JSONArray jsonArray = new JSONArray(mens.getSala().getListUsuarios());
        obj.put("sala_usuarios", jsonArray);
                
        return obj.toString();
    }

    public Mensagem parserStringMensagem(String mensStr) {
        JSONObject obj = new JSONObject(mensStr);
        
        Usuario usuario = new Usuario(obj.getInt("usuario_id"), obj.getString("usuario_nome"), obj.getString("usuario_senha"));
        
        JSONArray jsonArray = new JSONArray(obj.getJSONArray("sala_usuarios"));
        
        Sala sala = new Sala(obj.getInt("sala_id"), obj.getString("sala_nome"), usuario);
        
        Mensagem mens = new Mensagem(obj.getInt("id"),obj.getString("mensagem"), usuario, sala);
        
        return mens;
    }
}
