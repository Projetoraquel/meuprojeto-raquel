
package cinemaraquel;

public class Filme {
    String filme, atores, genero,curt;
    int duracao,classificacao,idade;
           
    
    void atribuirFilme ( String valor)
    {
        filme = valor;
    }
    String retornarFilme()
    {
        return filme;
     }
    
    
    void atribuirGenero ( String valor)
    {
        genero = valor;
    }
    String retornarGenero ()
    {
        return genero;
    }
    void atribuirIdade ( int valor)
    {
      idade = valor;
    }
    int retornarIdade ()
    {
        return idade;
    }
    
    
    void atribuirDuracao ( int valor)
    {
        duracao = valor;
    }
    Integer retornarDuracao ()
    {
        return duracao;
    }
    
    
    void atribuirAtores ( String valor)
    {
       atores = valor;
    }
    String retornarAtores()
    {
        return atores;
    }
    
    
     void atribuirClassificacao ( int valor)
    {
       classificacao = valor;
    }
    Integer retornarClassificacao()
    {
        return classificacao;
    }
    
    
    
     boolean id (int idade){
     if (idade >= classificacao){
         return true;
         }else
         return false;
 }
     
     String retornamet (){
         if ( duracao < 60){
             return "Curta Metragem";
         }
         else {
             return "Longa metragem";
         }
             
     }

}


