/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import threads.AguardandoCliente;

/**
 *
 * @author adm
 */
public class Servidor extends Thread {
      
   private int porta;
   private boolean ativo = true;
   private List<PrintStream> clientes;
   
   public Servidor (int porta) {
     this.porta = porta;
     this.clientes = new ArrayList<PrintStream>();
   }

   public void desativar(){
       this.ativo = false;
       
   }
    @Override
    public void run() {
        
        try {
             ServerSocket servidor = new ServerSocket(this.porta);
             System.out.println("Porta : "+porta+" aberta!");
             Comunic.setServ(this);
             while (ativo) {

               Socket cliente = servidor.accept();
               System.out.println("Nova conexão com o cliente " +   
                  cliente.getInetAddress().getHostAddress()
               );

               PrintStream ps = new PrintStream(cliente.getOutputStream());
               this.clientes.add(ps);

               AguardandoCliente ac = new AguardandoCliente(cliente.getInputStream(), this);
                    new Thread(ac).start();
             }
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
 
   public void distribuiMensagem(String msg) {
     
     for (PrintStream cliente : this.clientes) {
       cliente.println(msg);
//         System.out.println(msg);
     }
   }
    
}
