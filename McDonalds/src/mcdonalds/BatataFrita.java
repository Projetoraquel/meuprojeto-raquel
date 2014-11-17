package mcdonalds;
public class BatataFrita extends Produto {
    private String tamanho;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    

    
    public String descCardapio(){
      String x;
      x = this.descProd()+ ","+ this.tamanho;
        return x;
    }
    
    
    
    
}
