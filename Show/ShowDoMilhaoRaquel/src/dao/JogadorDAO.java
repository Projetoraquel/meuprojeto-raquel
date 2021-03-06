
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;

public class JogadorDAO {
    
    
    public Boolean inserir(Jogador jogador)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "INSERT INTO jogador(login,senha,email, imagem) VALUES (?,?, ?, ? )"; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,jogador.getNome());
        pst.setString(2,jogador.getSenha());
        pst.setString(3,jogador.getEmail());
        pst.setBytes(4, jogador.getImagem());
        pst.executeUpdate();
        retorno = true ;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno ;
        
    }
    
     
      public List<Jogador> listar()
     {
         List<Jogador> lista = new ArrayList<Jogador> ();
         String sql = "SELECT * FROM jogador";
         PreparedStatement pst = Conexao.getPreparedStatement(sql);
         try
         {
         ResultSet res = pst.executeQuery();
         while (res.next())
         {
             Jogador jogador = new Jogador();
             jogador.setNome(res.getString("login"));
             jogador.setSenha(res.getString("senha"));
             jogador.setEmail(res.getString("email"));
             jogador.setImagem(res.getBytes("imagem"));
             lista.add(jogador);
         }
         }
         catch (SQLException ex )
         {
             Logger.getLogger(JogadorDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return lista;
     }
      
      
      public Boolean excluir(Jogador jogador)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "DELETE FROM jogador WHERE login = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,jogador.getNome());
        pst.executeUpdate();
        retorno = true ;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno ;
    }
      public Boolean atualizar(Jogador jogador)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "UPDATE jogador SET senha = ? , email = ? , imagem = ? WHERE login = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        
        pst.setString(1,jogador.getSenha());
        pst.setString(2,jogador.getEmail());
        pst.setString(3,jogador.getNome());
        pst.setBytes(4, jogador.getImagem());
        
     
        pst.executeUpdate();
        retorno = true ;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
        return retorno ;
    }
      
      
      public Jogador login (Jogador jogador)
      {
          Jogador retorno=null;
          String sql= "SELECT * FROM jogador WHERE login = ? AND senha =?";
           PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1,jogador.getNome());
        pst.setString(2,jogador.getSenha());
        ResultSet res  = pst.executeQuery();
        
        if(res.next())
        {
            retorno =new Jogador();
            retorno.setNome(res.getString("login"));
            retorno.setSenha(res.getString("senha"));
            retorno.setEmail(res.getString("email"));
            retorno.setImagem(res.getBytes("imagem"));
        }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            
        }
        return retorno ;
      }
      
      
      
     }
        
    

