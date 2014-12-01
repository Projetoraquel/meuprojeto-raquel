package exerciciopenny;

import java.util.ArrayList;
import java.util.List;

public class Prateleira extends Sapatos {
    private String nome;
    private List<Sapatos> lista;
    
    public Prateleira(){
 
            lista = new ArrayList <Sapatos>();
    }

    

    public List<Sapatos> getLista() {
        return lista;
    }

    public void setLista(List<Sapatos> lista) {
        this.lista = lista;
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    
    
    public String mostrarsapatos(){
        String saida = "";
        for (Sapatos sapato : lista) {
            saida = saida + sapato.metsapato();
        }
        
        return saida;
    }
    
    
       
    
    
}
