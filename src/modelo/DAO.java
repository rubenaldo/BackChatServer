/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import banco.Banco;
import java.util.List;
import modelo.Usuario;

/**
 *
 * @author Rubenaldo
 */
public class DAO {
    private static Banco b;

    public DAO(Banco b) {
        this.b = b;
    }
    
    public static void inserirUsuario(Usuario usuario){
        b.usuarios.inserir(usuario);
    }
    public static void adicionarUsuarioSala(Sala sala, Usuario usuario){
        sala.addUsuario(usuario);
    }
    public static void inserirSala(Sala sala){
        b.salas.inserir(sala);
    }
    
    public static int proximoIdUsuario(){
        return b.usuarios.ultimoId();
    }
    public static int proximoIdSala(){
        return b.salas.ultimoId();
    }
    public static int proximoIdMensagem(){
        return b.mensagens.ultimoId();
    }
    public static Usuario buscarUsuario(int id){  
        return b.usuarios.recuperar(id);
    }
    public static List<Usuario> buscarUsuariosDaSala(int id){
        List<Usuario> usuariosSala = buscarSala(id).getListUsuarios();
        return usuariosSala;
    }
    
    public static List<Usuario> buscarTodosUsuarios(){
        return b.usuarios.recuperarTodos();
    }
    
    public static Sala buscarSala(int id){  
        return b.salas.recuperar(id);
    }
    
    public static Sala buscarIdSala(String nome){
        int idSala = 0;
        List<Sala> salas = DAO.buscarTodasSalas();
        
        for (Sala sala : salas) {
            if (sala.getNome().equals(nome)) {
                idSala = sala.getId();
            }
            
        }
        
        return b.salas.recuperar(idSala);
    }
    
    public static Usuario buscarIdUsuario(String nome){
        int idUsuario = 0;
        List<Usuario> usuarios = DAO.buscarTodosUsuarios();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome)) {
                idUsuario = usuario.getId();
            }
            
        }
        
        return b.usuarios.recuperar(idUsuario);
    }
    
    public static List<Sala> buscarTodasSalas(){
        return b.salas.recuperarTodos();
    }
    
}
