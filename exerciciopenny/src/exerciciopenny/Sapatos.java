
package exerciciopenny;
public class Sapatos {
    private String cor, modelo, num;
    private boolean preferido;
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPreferido() {
        return preferido;
    }

    public void setPreferido(boolean preferido) {
        this.preferido = preferido;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    public String metsapato () {
        String x;
        if (this.preferido == true ){
            x = this.modelo + ": " + this.cor  + "," + this.num + "Achei!";
        }else {
            x = this.modelo + ": " + this.cor + "," + this.num;
        }
        return x;
              
    }
    
}
