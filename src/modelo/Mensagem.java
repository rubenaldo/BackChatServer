/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author adm
 */
public class Mensagem {
    private int id;
    private String mensagem;
    private Usuario usuario;
    private Sala sala;

    

    public Mensagem(int id, String mensagem, Usuario usuario, Sala sala) {
        this.id = id;
        this.mensagem = mensagem;
        this.usuario = usuario;
        this.sala = sala;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public String buscarMens(String u){
        String mensAtual = null;
        if (usuario.getNome().equals(u)) {
            mensAtual = mensagem;
            return mensAtual;
        }
        return mensAtual;
    }
    
    
    
    
}
