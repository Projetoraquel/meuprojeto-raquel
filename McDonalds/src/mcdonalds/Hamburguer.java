package mcdonalds;

public class Hamburguer extends Produto {
    
   private boolean novo;


    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
    
    public String descCardapio (){
        String retornar, n; 
      if (this.novo == true) {
          n = "sim";
      } else {
          n = "não";     }
        return this.descProd() + n;
    }
    
}
