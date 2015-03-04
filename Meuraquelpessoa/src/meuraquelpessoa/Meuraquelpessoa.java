package meuraquelpessoa;

import javax.swing.JOptionPane;

public class Meuraquelpessoa {

    public static void main(String[] args) {
      
        Pessoa p = new Pessoa();
        
        while (p.getCodigo() == null)
        {
            try
            {
                p.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:")));
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Digite novamente");
            }
        }
              
        p.setNome(JOptionPane.showInputDialog("Nome:"));
        p.setSexo(JOptionPane.showInputDialog("sexo:"));
        
        
        
        
    }
    
}
