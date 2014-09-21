package televisao;

import javax.swing.JOptionPane;

public class TesteAtor {
    public static void main(String[] args) {
       Ator a = new Ator();
        a.setNomeart(JOptionPane.showInputDialog("Nome do ator:"));
        a.setDnascimento(JOptionPane.showInputDialog("Data de nascimento:"));
        a.setEmail(JOptionPane.showInputDialog("Email:"));
        a.setQnovelas(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de novelas: ")));
        JOptionPane.showMessageDialog(null,"Ator:" +a.getNomeart()+"\nData de nascimento:" +a.getDnascimento()+"\nEmail:" +a.getEmail()+"\nQNovelas:"+a.getQnovelas());
        
        a.Status();
        
        
    }
    }
    

