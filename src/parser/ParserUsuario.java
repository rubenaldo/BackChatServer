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
public class ParserUsuario {
    
    public String parserUsuarioString(Usuario user) {
        JSONObject obj = new JSONObject();
        
        obj.put("id", user.getId());
        obj.put("nome", user.getNome());
        obj.put("senha", user.getSenha());
        
        return obj.toString();
        
    }
    
    public Usuario parserStringUsuario(String userStr) {
        JSONObject obj = new JSONObject(userStr);
        
        Usuario usuario = new Usuario(obj.getInt("id"),obj.getString("nome"), obj.getString("senha"));
        
        return usuario;
    }
}
