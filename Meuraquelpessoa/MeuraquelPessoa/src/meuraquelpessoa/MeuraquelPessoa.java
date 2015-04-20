package meuraquelpessoa;

import javax.swing.JOptionPane;
import modelo.Pessoa;

public class MeuraquelPessoa {

    public static void main(String[] args) {
        
       Pessoa pes = new Pessoa();
       while(pes.getCod()==null)
       {
       try
       {
           //aqui e onde estou executando
           pes.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite seu codigo:")));
       }
       catch(Exception ex)
       {
           //aqui é oq quero fazer quando der erro
           JOptionPane.showMessageDialog(null, "É NUMERO" + pes.getCod());
       }
       }    
       
       
       pes.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
       pes.setSexo(JOptionPane.showInputDialog("Digite o Sexo"));
       
       JOptionPane.showMessageDialog(null, "codigo:" + pes.getCod()+   "\nPessoa:" + pes.getNome() + "\nSexo:"+ pes.getSexo());
       
       
  
    }
    
}
