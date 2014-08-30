package cinemaraquel;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CinemaRaquel {

    public static void main(String[] args) {
        Filme t = new Filme ();
        Ator a = new Ator();
        int idade = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        t.atribuirFilme(JOptionPane.showInputDialog("NOME DO FILME:"));
        t.atribuirDuracao(Integer.parseInt(JOptionPane.showInputDialog("DURCAÇÃO DO FILME EM MINUTOS:")));
        t.atribuirClassificacao(Integer.parseInt(JOptionPane.showInputDialog("CLASSIFICAÇÃO DO FILME:")));
        t.atribuirGenero(JOptionPane.showInputDialog("GENERO:"));
       
       t.atribuirAtores(JOptionPane.showInputDialog("Nome do ator:"));
       a.atribuircache(Float.parseFloat(JOptionPane.showInputDialog("Cache:")));
       a.atribuirdata(JOptionPane.showInputDialog("Data de nascimento"));
       a.atribuirtotalfilmes(Integer.parseInt(JOptionPane.showInputDialog("Total de filmes:")));
       a.atribuirtotalfilmesano(Integer.parseInt(JOptionPane.showInputDialog("Total de lançados no ultimo ano:")));
       String ganhou = JOptionPane.showInputDialog("Ganhou oscar ? S/N ");
       
       if (ganhou.equals("S")){
           a.atribuirvencedor (true);
       }else
       {
           a.atribuirvencedor(false);
       }
       
       if (a.retornarvencedor() == true){
           ganhou = "Sim";
       }else {
           ganhou = "Nao";
       }
          
        t.atribuirIdade(Integer.parseInt(JOptionPane.showInputDialog("INFORME SUA IDADE:")));
        JOptionPane.showMessageDialog(null,"Filme:"+t.retornarFilme()+"\nDuracao:"+t.retornarDuracao()+"minutos \nClassificacao:"+t.retornarClassificacao()+"anos \nGenero:"+t.retornarGenero()+"\nAtores:"+t.retornarAtores()+"\n"+t.retornamet());
        
    if (t.id(idade) == true){
        JOptionPane.showMessageDialog(null,"Pode assistir");
    }else
        JOptionPane.showMessageDialog(null,"Não pode assistir");
    JOptionPane.showMessageDialog(null,"Ator:"+t.retornarAtores()+"\nCache:"+a.retornarcache()+"\nData de nascimento:"+a.retornardata()+"\nTotal de filmes"+a.retornartotalfilmes()+"\nFilmes lançados este ano:"+a.retornartotalfilmesano()+"Ganhou Oscar:"+ganhou+"Ganhos no ano:"+a.retornarganho()+"Reais");
 }
      
}
    
    
        
        
    
    

