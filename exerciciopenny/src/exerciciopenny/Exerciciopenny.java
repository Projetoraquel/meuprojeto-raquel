
package exerciciopenny;

import javax.swing.JOptionPane;


public class Exerciciopenny {

    public static void main(String[] args) {
        Prateleira p = new Prateleira();
        
        Sapatos s = new Sapatos();
          
        s.setModelo("Flex");  
        s.setCor("Azul");
        s.setNum("30");
        s.setPreferido(false);
        
        Sapatos s2 = new Sapatos();
        
        s2.setModelo("\nMelissa");
        s2.setCor("Rosa");
        s2.setNum("35");
        s2.setPreferido(false);
        
        Sapatos s4 = new Sapatos();
        
        s4.setModelo("\nTênis");
        s4.setCor("Amarelo");
        s4.setNum("35");
        s4.setPreferido(false);
        
        sapatosalto ss = new sapatosalto();
        
        ss.setModelo("\nTotal Confort");
        ss.setCor("Verde");
        ss.setNum("35");
        ss.setPreferido(false);
        ss.setSalto(7);
        
        botas s3 = new botas();
        
        s3.setModelo("\nSandália");
        s3.setCor("Verde");
        s3.setNum("35");
        s3.setPreferido(false);
        s3.setAlturacano(2.0);
        s3.setSolado("plataforma");
        
       

        p.getLista().add(s);
        p.getLista().add(s2);
        p.getLista().add(s4);
         p.getLista().add(ss);
        p.getLista().add(s3);
        
        p.setNome("A");
        
        JOptionPane.showMessageDialog(null, "Preteleira:" + p.getNome() + "\n" + p.mostrarsapatos());

         p = new Prateleira();
        
        Sapatos b = new Sapatos();
        
        b.setModelo("\nTênis");
        b.setCor("Rosa");
        b.setNum("35");
        b.setPreferido(false);
        p.getLista().add(s2);
        p.setNome("B");
        
        Sapatos b2 = new Sapatos();
        
        b2.setModelo("\nTênis");
        b2.setCor("Amarelo");
        b2.setNum("35");
        b2.setPreferido(false);
        p.getLista().add(b2); 
        sapatosalto sal = new sapatosalto();
        
        sal.setModelo("\nSandália");
        sal.setCor("Verde");
        sal.setNum("35");
        sal.setPreferido(false);
        sal.setSalto(7);
        p.getLista().add(sal);
        
         sapatosalto sal1 = new sapatosalto();
        
        sal1.setModelo("\nTamanco");
        sal1.setCor("Rosa-Bebê");
        sal1.setNum("35");
        sal1.setPreferido(false);
        sal1.setSalto(7);
        p.getLista().add(sal1);
        p.setNome("B");
        
         botas bot = new botas();
        
        bot.setModelo("\nBota Ramarim");
        bot.setCor("Preta");
        bot.setNum("35");
        bot.setPreferido(false);
        bot.setAlturacano(2.0);
        bot.setSolado("plataforma");
        p.getLista().add(bot);
        
        JOptionPane.showMessageDialog(null, "Preteleira:" + p.getNome() + "\n" + p.mostrarsapatos());
        
             
       
        
      
          
          
        
       
        
     
    }
    
}
