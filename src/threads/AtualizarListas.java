/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import views.JF_principal;
import views.jF_chat;


/**
 *
 * @author Rubenaldo
 */
public class AtualizarListas extends Thread {
    private JList jLista;
    private String nomeLista;

    public AtualizarListas(String nomeLista, JList jLista) {
        this.nomeLista = nomeLista;
        this.jLista = jLista;
    }
    
    @Override
    public void run() {
        DefaultListModel modelo = null;
        switch(nomeLista){
            case "salas":
                modelo = JF_principal.preencherListSalas();
                jLista.setModel(modelo);
                break;
            case "usuarios":
                modelo = jF_chat.preencherListUsuarios();
                jLista.setModel(modelo);
                break;
        }
        
        
    }
    
    
}
