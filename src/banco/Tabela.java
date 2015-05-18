/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author adm
 */
public class Tabela<C> {
    private int id;
    private Map<Integer, C> instancias;

    public Tabela() {
        id = 0;
        instancias = new HashMap<>();
    }

    public int ultimoId(){
        return id;
    }
    public void inserir(C instancia) {
        this.instancias.put(id, instancia);
        id++;
    }

    public List<C> recuperarTodos(){
        return new ArrayList<>(this.instancias.values());
    }
    
    public C recuperar(int id) {

        if (this.instancias.containsKey(id)) {
            C instancia = this.instancias.get(id);
            return instancia;
        } else {
            System.out.println("Não tem este id!!");
            return null;
        }


    }

    public C buscar(String nome) {

        if (this.instancias.containsValue(nome)) {
            C instancia = this.instancias.get(nome);
            return instancia;
        } else {
            System.out.println("Não tem este nome!!");
            return null;
        }


    }
    
    public void alterar(int id, C instancia) {
        if (this.instancias.containsKey(id)) {
            this.instancias.put(id, instancia);
        } else {
            System.out.println("Não tem este id!!");
        }
    }

    public void remover(int id) {
        if (this.instancias.containsKey(id)) {
            this.instancias.remove(id);
        } else {
            System.out.println("Não tem este id!!");
        }


    }
}
