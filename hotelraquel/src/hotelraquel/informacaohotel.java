package hotelraquel;
public class informacaohotel {
    String nome = "Hotel Classic", localizacao = "Avenida 51", telefone ="55-51543312", anofund ="1998";
    double diaria = 30.0, valorhosp,x,y,z;
    int dias =0;
    
    void atribuirnome(String valor){
        nome = valor;
      }
    String retornarnome (){
        return nome;
    }
    void atribuirlocalizacao(String valor){
        localizacao = valor;
      }
    String retornarlocalizacao (){
        return localizacao;
    }
    void atribuirtelefone (String valor){
        telefone = valor;
      }
    String retornartelefone (){
        return telefone;
    }
    void atribuiranofund(String valor){
        anofund = valor;
      }
    String retornaranofund (){
        return anofund;
    }
    void atribuirdiaria(float valor){
        diaria = valor;
      }
    double retornardiaria (){
        return diaria;
    }
    void atribuirdias(int valor){
        dias = valor;
      }
    int retornardias (){
        return dias;
    }
    
   double retornax (){
       if(dias < 7){
           x = (diaria * dias );
       }else
       if (dias >= 7 || dias <= 10){
     x = ((dias * diaria ) - ((dias * diaria) * 0.1));
     return x ;
}else if (dias > 10){
    x = ((dias * diaria) - ((dias * diaria)* 0.3));
    } return x;
   }
  
   double retornaeuro(){
       y = x * 3;
       return y;
   }
   double retornadolar(){
       z  = x*2;
       return z;
   }
   
   String retornainformacao(){
       return "Até 6 dias você paga a tarifa normal || \n de 7 à 10 dias você tem 10% de desconto ||  \n mais de 10 dias 30% de desconto";
   }
   
   
}
