package televisao;
public class Apresentador {
     private String nome, dnascimento, programa, email, nomeart, cidade, endereco, bairro, estado;
    private double salario, cache, merchandising;
    
    public Apresentador (){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDnascimento() {
        return dnascimento;
    }

    public void setDnascimento(String dnascimento) {
        this.dnascimento = dnascimento;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeart() {
        return nomeart;
    }

    public void setNomeart(String nomeart) {
        this.nomeart = nomeart;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public double getMerchandising() {
        return merchandising;
    }

    public void setMerchandising(double merchandising) {
        this.merchandising = merchandising;
    }
    public Double calcularGanhos(int nEvento){
        return (nEvento * cache) + merchandising + salario;
        
    }
      
}

    

