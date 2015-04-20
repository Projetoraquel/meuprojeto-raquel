
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

public class TesteBandodeDados {
    public static void main(String[] args) {
        inserir();
        List<Jogador> lista = Listar();
        for (Jogador jogador : lista) {
            System.out.println(jogador.getNome() +"\n");
            
        }
    }
          
    public static List<Jogador>Listar()
    {
         List<Jogador> jogadores = new ArrayList<Jogador>();
        try {
       String sql= "SELECT * FROM JOGADOR";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       ResultSet res = pst.executeQuery();
       while(res.next())
       {
           Jogador jog = new Jogador ();
           jog.setNome(res.getString("login"));
           jog.setSenha(res.getString("senha"));
           jog.setEmail(res.getString("email"));
           jogadores.add(jog);
       }
       
    }catch (SQLException ex ){
        Logger.getLogger(TesteBandodeDados.class.getName()).log(Level.SEVERE,null,ex);
    } 
        return jogadores;
    }
    public static void inserir()
    {
     String sql,login,senha,email;
     login = JOptionPane.showInputDialog("Login:");
     email = JOptionPane.showInputDialog("Email");
     senha = JOptionPane.showInputDialog("Senha:");
     sql = "INSERT INTO jogador (login,senha,email)" + "VALUES (?,?,?)";
     PreparedStatement pst
                    = Conexao.getPreparedStatement(sql);
        try {
            pst.setString (1,login);
            pst.setString (2,senha);
            pst.setString (3,email);         
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBandodeDados.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
}}
