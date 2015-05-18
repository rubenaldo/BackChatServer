/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import modelo.Mensagem;
import modelo.Sala;
import modelo.Usuario;

/**
 *
 * @author adm
 */
public class Banco {
    public Tabela<Usuario> usuarios;
    public Tabela<Mensagem> mensagens;
    public Tabela<Sala> salas;
    

    public Banco() {
        usuarios = new Tabela();
        mensagens = new Tabela();
        salas = new Tabela();

        
    }
   
    
}
