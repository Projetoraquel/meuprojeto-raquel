package mcdonalds;

public class McOferta extends Produto {
    private Hamburguer hamburguer;
    private BatataFrita batatafrita;
    private Bebida bebida;

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public BatataFrita getBatatafrita() {
        return batatafrita;
    }

    public void setBatatafrita(BatataFrita batatafrita) {
        this.batatafrita = batatafrita;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
    
    public String descCardapio (){
        String retornar;
        retornar = this.descProd();
        return retornar;
        
    }
    public Double valoreconomia () {
        Double retornar;
        retornar = (this.bebida.getPreco() + this.batatafrita.getPreco()+this.hamburguer.getPreco()) - this.getPreco();
        return retornar;
    }
}
   
    

