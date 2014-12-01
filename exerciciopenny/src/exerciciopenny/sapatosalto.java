package exerciciopenny;

public class sapatosalto extends Sapatos{
    private double salto;

    public double getSalto() {
        return salto;
    }

    public void setSalto(double salto) {
        this.salto = salto;
    }
    
    public String metsapato(){
        String x;
        x = super.metsapato() + "-" + this.salto;
        return x;
    }
    
}
