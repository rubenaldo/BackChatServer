/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adm
 */
public class Sala {
    
    private String nome;
    private int id;
    private List<Usuario> listUsuarios;
   
    
    public Sala(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.listUsuarios = new ArrayList<>();
    }

    
    
    public Sala(int id, String nome, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.listUsuarios = new ArrayList<>();
        addUsuario(usuario);
    }

    public List<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(List<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addUsuario(Usuario usuario){
        listUsuarios.add(usuario); 
    }
    
    public void removeUsuario(Usuario usuario){
        listUsuarios.remove(usuario);
    }
    
    public int totalUsuario(){
        return listUsuarios.size();
    }
    
    
}
