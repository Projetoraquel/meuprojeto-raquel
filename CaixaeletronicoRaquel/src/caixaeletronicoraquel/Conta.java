package caixaeletronicoraquel;

public class Conta {
    String agencia = "7894", nconta = "1245896-458", ncorrentista,fecharconta;
    float saldo, valor;
    boolean ativa;
    
    void abrir (String valor, String valor1, String valor2){
        agencia = valor;
        nconta = valor1;
        ncorrentista = valor2;
        saldo = 0;
        ativa = true;
    }
   
    boolean sacar (){
         if (valor >= saldo){
         return true;
         }else
         return false;
    }
    boolean depositar(){
        if (ativa == true){
            saldo = valor;
            return true;
        }else
             return false;
    }
    float saldo (){
        return saldo;
    }
    void atribuirfecharconta (){
        ativa = false;
    }
    
    
}
