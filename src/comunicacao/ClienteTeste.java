/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import threads.Recebedor;

/**
 *
 * @author adm
 */
public class ClienteTeste {
    public static void main(String[] args) throws UnknownHostException, IOException {
     // dispara cliente
     new ClienteTeste("127.0.0.1", 1515).executa();
   }
   
   private String host;
   private int porta;
   
   public ClienteTeste (String host, int porta) {
     this.host = host;
     this.porta = porta;
   }
   
   public void executa() throws UnknownHostException, IOException {
     Socket clienteTeste = new Socket(this.host, this.porta);
     System.out.println("O cliente TESTE se conectou ao servidor!");
 
     // thread para receber mensagens do servidor
     Recebedor r = new Recebedor(clienteTeste.getInputStream());
     new Thread(r).start();
     
     // lê msgs do teclado e manda pro servidor
     Scanner teclado = new Scanner(System.in);
     PrintStream saida = new PrintStream(clienteTeste.getOutputStream());
     while (teclado.hasNextLine()) {
       saida.println(teclado.nextLine());
     }
     
     saida.close();
     teclado.close();
     clienteTeste.close();    
   }
}
