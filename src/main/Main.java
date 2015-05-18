/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import banco.Banco;
import modelo.DAO;
import comunicacao.Cliente;
import comunicacao.Comunic;
import comunicacao.Servidor;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Mensagem;
import modelo.Sala;
import modelo.SalaPrincipal;
import modelo.Usuario;
import views.JF_principal;

/**
 *
 * @author adm
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
    
    
    public static void main(String[] args) throws Exception {
       
        Banco b = new Banco();
        DAO dao = new DAO(b);
        Comunic comunic = new Comunic();
        
//        for (int i = 0; i < 10; i++) {
//            Usuario u = new Usuario("Nome " + i, "Senha " + i);
//            b.usuarios.inserir(u);
//        }
//        SalaPrincipal sp = new SalaPrincipal();
//        
        Sala sala1 = new Sala(b.salas.ultimoId(), "Amigos_FAT");
        b.salas.inserir(sala1);
        Usuario u = new Usuario(b.usuarios.ultimoId(),"Rubenaldo", "123456");
        b.usuarios.inserir(u);
        Usuario u2 = new Usuario(b.usuarios.ultimoId(),"Thalison", "1234567");
        b.usuarios.inserir(u2);
        Usuario u3 = new Usuario(b.usuarios.ultimoId(),"Ze", "1234567");
        b.usuarios.inserir(u3);
        
        sala1.addUsuario(u);
        sala1.addUsuario(u2);
        sala1.addUsuario(u3);
//        
//        System.out.println(sala1.getNome()+" :( "+sala1.totalUsuario()+" )" );
//        
//        Mensagem m = new Mensagem(b.mensagens.ultimoId()+1, u.getNome(), "oi, tudo bem?");
//        Mensagem m1 = new Mensagem(b.mensagens.ultimoId()+1, u2.getNome(), "tudo bem.");
//        
//        b.mensagens.inserir(m);
//        b.mensagens.inserir(m1);
//        
//        List<Usuario> usuarios = b.usuarios.recuperarTodos();
//        List<Mensagem> mensagens = b.mensagens.recuperarTodos();
//        
////
//        System.out.println(" Mostrando o banco de dados de USUARIO:" );
//        for (Usuario usuario : usuarios) {
//            //String mens = null;
//            System.out.println("ID: "+usuario.getId()+"Nome: "+usuario.getNome());
//            for (Mensagem mensagem : mensagens) {
//                
//                System.out.println(mensagem.buscarMens(usuario.getNome()));
//            }
            
//        }
       
        //Servidor.main(args);
//        Cliente.main(args);
        
        JF_principal principal = new JF_principal();
        principal.setVisible(true);
        
    }
    
    public static void mostrarMensagem(String msg){
        if (msg.equals("")) {
            JOptionPane.showMessageDialog(null, "Sem mesagem definida!");
        } else {
            JOptionPane.showMessageDialog(null, msg);
        }
        
    
    }
}
