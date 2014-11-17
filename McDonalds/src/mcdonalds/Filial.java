package mcdonalds;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private Gerente gerente;
    private List <Cozinheiro> cozinheiro;
    private String cidade;
    private Double medialanche;
    private List <Caixa> caixa;
    private int qvendas;
       
    public Filial (){
        cozinheiro = new ArrayList<Cozinheiro>();
        caixa = new ArrayList<Caixa>();
        this.gerente = new Gerente();
        
    }

    public List<Cozinheiro> getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(List<Cozinheiro> cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public List<Caixa> getCaixa() {
        return caixa;
    }

    public void setCaixa(List<Caixa> caixa) {
        this.caixa = caixa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Double getMedialanche() {
        return medialanche;
    }

    public void setMedialanche(Double medialanche) {
        this.medialanche = medialanche;
    }


    public int getQvendas() {
        return qvendas;
    }

    public void setQvendas(int qvendas) {
        this.qvendas = qvendas;
    }
    
    public Double metfaturamento(){
        return qvendas * medialanche;
    }
    
        
    
    
}
