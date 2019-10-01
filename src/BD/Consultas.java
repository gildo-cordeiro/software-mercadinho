package BD;

import CLASSES.atributo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Consultas extends ConexaoBD{
   
    public ArrayList<atributo> ChangePassword(String login){
        ArrayList list = new ArrayList();
        PreparedStatement estado = null;
        String sql = "select senha from fun_dono where login = \""+login+"\";";
        
        ConectarDrive();
        try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {   
                atributo at = new atributo();
                at.setSenha(result.getString("senha"));
                list.add(at);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario não existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar senha!");
        }
        return list;
    }
     public boolean entrarLogin(String login, String senha){
        PreparedStatement estado = null;
        
        String sql = "select *from fun_dono where login = \""+login+"\" and senha = \""+senha+"\";";
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet Result = estado.executeQuery(sql);
            
            if(Result.next()) {                
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao entrar");
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão");
                return false;
            }
        }
    }
}
