package BD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Inserir extends ConexaoBD{
    
    public void Inserir(String login, String senha){
        
        PreparedStatement estado = null;
        
        String sql = "insert into funcionario values(?,?);";
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, login);
            estado.setString(2, senha);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Cadastro inserido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar! Por favor, verifique.");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão! Por favor, verifique.");
            }
        }    
    }
   
}
