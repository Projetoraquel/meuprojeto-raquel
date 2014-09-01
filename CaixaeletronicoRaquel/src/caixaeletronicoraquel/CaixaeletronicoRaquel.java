package caixaeletronicoraquel;

import javax.swing.JOptionPane;

public class CaixaeletronicoRaquel {

    public static void main(String[] args) {
        
    String agencia, nconta, ncorrentista,nome;
    float saldo;
    boolean sacar, depositar;
    
    Conta c = new Conta ();
    JOptionPane.showMessageDialog(null,"\nA sua conta é: "+c.nconta+"\nSua agencia é: "+c.agencia+"\nConta ATIVA !");
    boolean ativa = true;
    c.valor = (Float.parseFloat(JOptionPane.showInputDialog(null,"Informe um valor para deposito:")));
    JOptionPane.showMessageDialog(null, c.depositar());
    JOptionPane.showInputDialog(null,"SAQUE:");
    c.sacar();
    
    
      
    }
    
}
