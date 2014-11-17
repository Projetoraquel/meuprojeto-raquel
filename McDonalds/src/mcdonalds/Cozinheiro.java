package mcdonalds;

public class Cozinheiro {
    private String nome, dnascimento, cpf;
    private boolean turno;
    private Double salario = 1.300;

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

      public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }
    
    public Double retsalario(){
        if (turno == true){
            return salario + 400.00;
          }else 
            return salario;
        
    }
    
}
