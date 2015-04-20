
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pessoa;

public class TesteBancodeDados {

    public static void main(String[] args) {
         inserir();
        List<Pessoa> lista = Listar();
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome() +"\n");
            
        }
    }
          
    public static List<Pessoa>Listar()
    {
         List<Pessoa> pessoas = new ArrayList<Pessoa>();
        try {
       String sql= "SELECT * FROM PESSOA";
       PreparedStatement pst = Conexao.getPreparedStatement(sql);
       ResultSet res = pst.executeQuery();
       while(res.next())
       {
           Pessoa pes = new Pessoa ();
           pes.setNome(res.getString("login"));
           pes.setCodigo(res.getInt("codigo"));
           pes.setSexo(res.getString("sexo"));
           pessoas.add(pes);
       }
       
    }catch (SQLException ex ){
        Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE,null,ex);
    } 
        return pessoas;
    }
    public static void inserir()
    {
     String sql,login,senha,codigo;
     login = JOptionPane.showInputDialog("Login:");
     codigo = JOptionPane.showInputDialog("codigo");
     senha = JOptionPane.showInputDialog("sexo");
     sql = "INSERT INTO jogador (login,senha,email)" + "VALUES (?,?,?)";
     PreparedStatement pst
                    = Conexao.getPreparedStatement(sql);
        try {
            pst.setString (1,login);
            pst.setString(2,codigo);
            pst.setString (3, senha);         
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
     
    }
    
}
