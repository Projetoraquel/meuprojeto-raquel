package mcdonalds;
public class Caixa {
    private String nome, dnascimento, cpf;
    private Float horatrab;
    private Double salario = 1.200;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Float getHoratrab() {
        return horatrab;
    }

    public void setHoratrab(Float horatrab) {
        this.horatrab = horatrab;
    }
    public Double retsalario(){
        return salario;
    }
    
    
    
}
