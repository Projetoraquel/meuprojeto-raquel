
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

public class PerguntaDAO {
    
    public Boolean inserir(Pergunta pergunta){
        Boolean retorno;
        String sql = "INSERT INTO pergunta(enunciado, a, b, c, d, certa, nivel )VALUES (? ,? ,?, ?, ?,?, ? )";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            pst.setString(1,pergunta.getEnunciado());
            pst.setString(2,pergunta.getA());
            pst.setString(3,pergunta.getB());
            pst.setString(4,pergunta.getC());
            pst.setString(5,pergunta.getD());
            pst.setString(6,pergunta.getCerta());
            pst.setInt(7,pergunta.getNivel());
            //executa o sql no banco de dados
            pst.executeUpdate();
            retorno= true;
        }
        catch (Exception ex ){
            ex.printStackTrace();
            retorno= false ;
        }
        return retorno;
        
    }
    
    public List<Pergunta> listarNivel1()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta WHERE nivel = 1 ORDER BY random() LIMIT 6 ";
          PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
        
    }
    public List<Pergunta> listarNivel2 ()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta WHERE nivel = 2 ORDER BY random() LIMIT 6 ";
          PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
        
    }
    public List<Pergunta> listarNivel3 ()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta WHERE nivel = 3 ORDER BY random() LIMIT 6 ";
          PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
        
    }
    public List<Pergunta> listarNivel4 ()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta WHERE nivel = 4 ORDER BY random() LIMIT 6 ";
          PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
        
    }
    public List<Pergunta> listarNivel5 ()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta WHERE nivel = 5 ORDER BY random() LIMIT 1 ";
          PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
        
    }
    
    
    public List <Pergunta> listar()
    {
        List<Pergunta> lista = new ArrayList<Pergunta>();
        String sql = "SELECT * FROM pergunta";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            ResultSet res = pst.executeQuery();
            while(res.next())
            {
                Pergunta pergunta = new Pergunta();
                pergunta.setEnunciado(res.getString("enunciado"));
                 pergunta.setA(res.getString("A"));
                 pergunta.setB(res.getString("B"));
                 pergunta.setC(res.getString("c"));
                 pergunta.setD(res.getString("D"));
                 pergunta.setCerta(res.getString("certa"));
                 pergunta.setNivel(res.getInt("nivel"));
                 pergunta.setId(res.getInt("id"));
                 lista.add(pergunta);
           
            }
        }
        catch (SQLException ex )
        {
            Logger.getLogger(PerguntaDAO.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
    }
     public Boolean excluir(Pergunta pergunta)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "DELETE FROM pergunta WHERE id = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setInt(1,pergunta.getId());
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
      public Boolean atualizar(Pergunta pergunta)
    {
        Boolean retorno;
        //monta o sql de insert da tabela
       String sql= "UPDATE pergunta SET enunciado = ? , a = ? , b= ?, c=?, d=?, certa=?, nivel=?  WHERE id = ? "; 
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
            pst.setString(1,pergunta.getEnunciado());
            pst.setString(2,pergunta.getA());
            pst.setString(3,pergunta.getB());
            pst.setString(4,pergunta.getC());
            pst.setString(5,pergunta.getD());
            pst.setString(6,pergunta.getCerta());
            pst.setInt(7,pergunta.getNivel());
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
     }
        
   
