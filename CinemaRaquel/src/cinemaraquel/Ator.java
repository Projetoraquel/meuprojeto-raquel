package cinemaraquel;

public class Ator {
    String ator, data;
    float cache,ganho;
    boolean vencedor;
    int totalfilmes,totalfilmesano;
    
    
    void atribuirator(String valor){
        ator = valor;
    }
    String retornarator(){
        return ator;
    }
    void atribuirdata(String valor){
        data = valor;
    }
    String retornardata(){
        return data;
    }
    void atribuircache(float valor){
        cache = valor;
    }
    float retornarcache(){
        return cache;
    }
    void atribuirvencedor(boolean valor){
        vencedor = valor;
    }
    boolean retornarvencedor(){
        return vencedor;
    }
    void atribuirtotalfilmes(int valor){
        totalfilmes = valor;
    }
    int retornartotalfilmes(){
        return totalfilmes;
    }
    void atribuirtotalfilmesano(int valor){
        totalfilmesano = valor;
    }
    int retornartotalfilmesano(){
        return totalfilmesano;
    }
    float retornarganho(){
        return cache*totalfilmesano;
    }
}
