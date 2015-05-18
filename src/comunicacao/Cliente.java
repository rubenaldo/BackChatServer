/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;
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
    private List<String> msg;
    PrintStream saida;
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
        msg.add(parsermsg.parserMensagemString(m));
        saida = new PrintStream(cliente.getOutputStream());
//        saida.println(msg);
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
            while (msg.size()>0) {
              saida.println(msg);
            }
            Scanner teclado = new Scanner(host);
            
            while (teclado.hasNextLine()) {
              saida.println(msg);
            }

//            saida.close();
//            teclado.close();
//            cliente.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
   public void executa() throws Exception {
     
     
   }
    
    
    
    
}
