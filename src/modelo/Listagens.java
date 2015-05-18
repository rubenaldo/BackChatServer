/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Rubenaldo
 */
public class Listagens {
    DefaultComboBoxModel cmbselecao = new DefaultComboBoxModel();
    Usuario user;
    private List<Usuario> listaUsuario;

public DefaultComboBoxModel carregarComboxCategoria() {
    
        
        
        while (cmbselecao.getSize() > 0) {
            cmbselecao.removeAllElements();
        }

//        System.out.println("Nome da lista de usuario: "+DAO.buscarUsuario(0).getNome());
        listaUsuario = DAO.buscarTodosUsuarios();
//        List<Tbcategoria> lista = Conexao.buscarCategoria(pesquisa);

        if (listaUsuario != null) {
            String[] linha = new String[]{null, null, null, null};
            cmbselecao.addElement("TODAS...");
//            System.out.println("Numero da lista de usuario: "+listaUsuario.size());
            for (Usuario usuario : listaUsuario) {
                cmbselecao.addElement(usuario.getNome());
            }
//            for (int i = 0; i < listaUsuario.size(); i++) {
//                
////                cmbselecao.addElement(listaUsuario.get(i).getNome());
//            }
        }
        return cmbselecao;
    }
}
