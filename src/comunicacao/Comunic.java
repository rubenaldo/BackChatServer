/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comunicacao;

/**
 *
 * @author adm
 */
public class Comunic {
    private static Servidor serv;
    private static Cliente clie;
    
    public Comunic() {
        
    }
    
    public Comunic(Servidor serv, Cliente clie) {
        this.serv = serv;
        this.clie = clie;
    }
    
    public static Servidor getServ() {
        return serv;
    }

    public static void setServ(Servidor s) {
        serv = s;
    }

    public static Cliente getClie() {
        return clie;
    }

    public static void setClie(Cliente c) {
        clie = c;
    }
    
    
    
}
