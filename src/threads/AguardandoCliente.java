/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import comunicacao.Servidor;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class AguardandoCliente extends Thread {
    
   private InputStream cliente;
   private Servidor servidor;
 
   public AguardandoCliente(InputStream cliente, Servidor servidor) {
     this.cliente = cliente;
     this.servidor = servidor;
   }
 
   public void run() {
     // quando chegar uma msg, distribui pra todos
     Scanner s = new Scanner(this.cliente);
     while (s.hasNextLine()) {
       servidor.distribuiMensagem(s.nextLine());
     }
     s.close();
   }
   
   
}
