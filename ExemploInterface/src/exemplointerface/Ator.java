package televisao;
public class Ator {
       String nome,dnascimento,email, nomeart, cidade, bairro, estado, endereco;
       int qnovelas, qevento,x =0;
       private double salariomen, cache, ganhos,y;

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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQnovelas() {
        return qnovelas;
    }

    public void setQnovelas(int qnovelas) {
        this.qnovelas = qnovelas;
    }

    public double getSalariomen() {
        return salariomen;
    }

    public void setSalariomen(double salariomen) {
        this.salariomen = salariomen;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }
        
        
    public String Status() {
        if (qnovelas <= 3 && salariomen <= 5.000){
            return "Calouro";
        }else if (qnovelas <= 6){
            return "Revelação";
        }else if (qnovelas <= 6 && salariomen >= 30.000 ){
            return "Jóia";
        }else if(qnovelas >= 9 && salariomen <= 30.000){
            return "Elenco de Apoio";
        }else if(salariomen >= 30.000 && salariomen <= 100.000){
            return "Elenco principal";
        }else if(salariomen >= 100.000){
            return "Estrela";
        }else 
            return "Elenco regular";
    
}
    public Double Ganhos () {
        do {
            ganhos += qevento * cache ;
            y = ganhos +salariomen;
            x++;
        } while(x != qevento);
         
        return y;
    }

    
}

    

