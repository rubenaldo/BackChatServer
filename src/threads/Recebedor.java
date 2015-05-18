/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class Recebedor extends Thread {
    private InputStream servidor;
 
   public Recebedor(InputStream servidor) {
     this.servidor = servidor;
   }
 
   public void run() {
     Scanner s = new Scanner(this.servidor);
     while (s.hasNextLine()) {
        System.out.println(s.nextLine());
     }
   }
   
}
