package exerciciopenny;

public class botas extends Sapatos {
    private double alturacano;
    private String solado;

    public double getAlturacano() {
        return alturacano;
    }

    public void setAlturacano(double alturacano) {
        this.alturacano = alturacano;
    }
    public String getSolado() {
        return solado;
    }

    public void setSolado(String solado) {
        this.solado = solado;
    }
    
    public String metsapato(){
        String x;
        x = super.metsapato() + "-" + this.solado + "," + this.alturacano;
        return x;
    }
    
    
}
