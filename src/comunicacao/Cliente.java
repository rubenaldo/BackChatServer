/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import modelo.Mensagem;
import parser.ParserMensagem;
import threads.Recebedor;

/**
 *
 * @author adm
 */
public class Cliente extends Thread {
    private String host;
    private int porta;
    private String msg;
    Socket cliente;
//  public static void main(String[] args) 
//         throws Exception {
//     // dispara cliente
//     new Cliente("127.0.0.1", 1515).executa();
//   }
    public Cliente (String host, int porta) {
     this.host = host;
     this.porta = porta;
   }
    
    public void enviarMensagem(Mensagem m) throws IOException{
        ParserMensagem parsermsg = new ParserMensagem();
        msg = parsermsg.parserMensagemString(m);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        saida.println(msg);
    }
    @Override
    public void run() {
        
        try {
            cliente = new Socket(this.host, this.porta);
            System.out.println("O cliente se conectou ao servidor!");
            Comunic.setClie(this);
            
            // thread para receber mensagens do servidor
            Recebedor r = new Recebedor(cliente.getInputStream());
            new Thread(r).start();

            // lê msgs do teclado e manda pro servidor
//            Scanner teclado = new Scanner(System.in);
//            PrintStream saida = new PrintStream(cliente.getOutputStream());
//            while (teclado.hasNextLine()) {
//              saida.println(teclado.nextLine());
//            }
            Scanner teclado = new Scanner(host);
            
            while (teclado.hasNextLine()) {
              saida.println(msg);
            }

            saida.close();
            teclado.close();
            cliente.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void executa() throws Exception {
     
     
   }
    
    
    
    
}
