package hotelraquel;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Hotelraquel {

    public static void main(String[] args) {
        informacaohotel h = new informacaohotel ();
        //h.atribuirnome(JOptionPane.showInputDialog());
        JOptionPane.showMessageDialog(null,""+ h.retornarnome()+"\n Endereço: "+h.retornarlocalizacao()+ "\n Telefone: "+h.retornartelefone()+"\n Valor da diaria: "+h.retornardiaria()+ "Reais"+"\n Ano de fundação: "+h.retornaranofund());
        JOptionPane.showMessageDialog(null,""+ h.retornainformacao());
        h.atribuirdias(Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias você vai ficar no nosso hotel:")));
        JOptionPane.showMessageDialog(null,"O valor total de diarias é:" +h.retornax()+"\nEM EUROS" +h.retornaeuro()+"\nEM DOLAR:"+h.retornadolar());
      
     
       
        
        
        
    }
    
}
