package caixa_eletronico;

public class Cliente {
     private String CPF ;
     private String nome;
     private String datadenascimento;
     private String endereço;
     private boolean negativodoSPC ;
     private boolean negativodoSERASA ;  

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setDatadenascimento(String datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean isNegativodoSPC() {
        return negativodoSPC;
    }

    public void setNegativodoSPC(boolean negativodoSPC) {
        this.negativodoSPC = negativodoSPC;
    }

    public boolean isNegativodoSERASA() {
        return negativodoSERASA;
    }

    public void setNegativodoSERASA(boolean negativodoSERASA) {
        this.negativodoSERASA = negativodoSERASA;
    }
     
     
}
