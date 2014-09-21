package caixa_eletronico;

import javax.swing.JOptionPane;

public class Caixa_eletronico {
   
    public static void main(String[] args) {
      
        conta c  = new conta();
        
        c.abrir("Ana", "123", "0120");
       
        c.sacar(330.0);
        
        System.out.println(c.retornarSaldo());
        Boolean deucerto;
        c.abrir("Marcelo", "123456", "7690000");
        
        deucerto = c.depositar(13.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, 
                    "Depósito realizado com sucesso\nSaldo:"+c.retornarSaldo());
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Depósito não realizado");
        }
                
        
        deucerto = c.sacar(20.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
        
        deucerto = c.sacar(9.0);
        if(deucerto==true)
        {
            JOptionPane.showMessageDialog(null, 
                    "Saque realizado com sucesso\nSaldo:"+c.retornarSaldo());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Saque não realizado");
        }
        */
    }
    
}
