/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;


import java.util.ArrayList;
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
    ParserUsuario pUsuario;
    
    public String parserMensagemString(Mensagem mens) {
        JSONObject obj = new JSONObject();
        obj.put("id", mens.getId());
        obj.put("mensagem", mens.getMensagem());
        obj.put("usuario", mens.getUsuario());
        obj.put("sala", mens.getSala());
        
        return obj.toString();
        
    }

    public Mensagem parserStringMensagem(String mensStr) {
        JSONObject obj = new JSONObject(mensStr);
        
//        JSONObject us = obj.getJSONObject("usuario");
//        Usuario user = pUsuario.parserStringUsuario(us.toString());
        Usuario usuario = pUsuario.parserStringUsuario(obj.getString("usuario"));
        
        
        JSONArray jsonArray = new JSONArray(obj.getJSONArray("sala_usuarios"));
        
        Sala sala = new Sala(obj.getInt("sala_id"), obj.getString("sala_nome"), usuario);
        
        Mensagem mens = new Mensagem(obj.getInt("id"),obj.getString("mensagem"), usuario, sala);
        
        return mens;
    }
}
