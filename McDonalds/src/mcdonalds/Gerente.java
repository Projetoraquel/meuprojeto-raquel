package mcdonalds;
public class Gerente {
    private String nome, dnascimento, cpf;
    private Double salario = 3.500;

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

   public Double metsalario () {
       return salario;
   }
    
    
}
