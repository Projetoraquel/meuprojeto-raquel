package televisao;
public class Novela {
     private String titulo, duracao, dcapitulo1,dcapitulo2, exibicao, autor, emissora;
     private int id;
    private float ibope;
    private boolean violencia, sexo, drogas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getDcapitulo1() {
        return dcapitulo1;
    }

    public void setDcapitulo1(String dcapitulo1) {
        this.dcapitulo1 = dcapitulo1;
    }

    public String getDcapitulo2() {
        return dcapitulo2;
    }

    public void setDcapitulo2(String dcapitulo2) {
        this.dcapitulo2 = dcapitulo2;
    }

    public String getExibicao() {
        return exibicao;
    }

    public void setExibicao(String exibicao) {
        this.exibicao = exibicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEmissora() {
        return emissora;
    }

    public void setEmissora(String emissora) {
        this.emissora = emissora;
    }

    public float getIbope() {
        return ibope;
    }

    public void setIbope(float ibope) {
        this.ibope = ibope;
    }

    public boolean isViolencia() {
        return violencia;
    }

    public void setViolencia(boolean violencia) {
        this.violencia = violencia;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }
   public String classificacao (){
       
       if ( id <= 14){
           return "Classificação: 14 anos";
       }else if ( id >= 14 && id <= 16){
           return "Classificação: 16 anos";
       }else 
           return "Classificação: 18 Anos";
       }
   
   public float media () {
       float pessoas = 10000;
       return ibope*pessoas;
   }
}
   



    
