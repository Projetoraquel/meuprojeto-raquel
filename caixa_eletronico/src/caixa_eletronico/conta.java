
package caixa_eletronico;
public class conta {
    
    /* 
    private - protegido, não posso ver fora da classe
    public - todos podem ver
    */
    
    
     private String nomeCorrentista;
     private String agencia;
     private String numeroConta;
     private Boolean ativa;
     private Double saldo;

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }

  

  
    
    
     public void abrir(String vnome, String vagencia, String vnumeroConta)
    {
        nomeCorrentista = vnome;
        agencia = vagencia;
        numeroConta = vnumeroConta;
        
        saldo = 0.0;
        ativa =true;
        
        
    }
    
    Boolean sacar(Double valor)
    {
        Boolean retorno = null;
        if(ativa==true)
        {
            if(valor<=saldo)
            {
                saldo = saldo-valor;
                retorno= true;
            }
            else
            {
                retorno= false;
            }
        }
        else
        {
            retorno= false;
        }
        return retorno;
    }
    
    Boolean depositar(Double valor)
    {
    
        Boolean retorno=null;
        if(ativa==true)
        {
            saldo = saldo + valor;
            retorno = true;
        }
        else
        {
            retorno=false;
        }
        return retorno;
    }
    
    void fecharConta()
    {
        ativa = false;
    }
    
    Double retornarSaldo()
    {
        return saldo;
    }
    
}
