package mcdonalds;
public class Bebida extends Produto {
   
    private int quantidade;
    private double unid;
 

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getUnid() {
        return unid;
    }

    public void setUnid(double unid) {
        this.unid = unid;
    }
    
    public String descCardapio () {
        String x;
        x = this.descProd()+ "," + this.quantidade +"," + this.unid;
        return x;
    }
    
    
}
