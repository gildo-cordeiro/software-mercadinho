package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    private String driver = "com.mysql.jdbc.Driver";
    private String str_com = "jdbc:mysql://localhost:3306/pdv";
    private String usuario = "root";
    private String senha = "";
    
    public Connection conectar;
    
    public void ConectarDrive(){
        try {
            Class.forName(driver);
            conectar = DriverManager.getConnection(str_com,usuario,senha);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "erro ao conectarcom o Drive, por favor, verifique.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro durnate a conexão, por favor, verifique.");
        }
    }
    
    public void FecharConexao(){
        try {
            conectar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão, por favor, verifique.");
        }
    }
}
