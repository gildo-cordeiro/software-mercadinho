/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import BD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Upar extends ConexaoBD{
    
    public void AtualizaDados(String senha,String login){
        
        String sql = "update fun_dono set senha=? where login=?";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, senha);
            estado.setString(2, login);
            estado.execute();
            JOptionPane.showMessageDialog(null, "foi");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
}
