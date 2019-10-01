/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author gildo
 */
public class Deletar extends ConexaoBD{
    public void DeleteProduto(ArrayList<String> codigo){
        String sql = "delete from produto where codigo in (?)";
        PreparedStatement estado=null;

        ConectarDrive();

        try {
           for (String p : codigo) {
                String row = p;
                estado=conectar.prepareStatement(sql);
                estado.setString(1, row);
                estado.execute();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao deletar","error", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void DeleteVenda(ArrayList<Integer> codigo){
        String sql = "delete from venda where id in (?)";
        PreparedStatement estado=null;

        ConectarDrive();

        try {
           for (int p : codigo) {
                int row = p;
                estado=conectar.prepareStatement(sql);
                estado.setInt(1, row);
                estado.execute();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error ao deletar","error", JOptionPane.ERROR_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void Delete(ArrayList<String> cpf, int indice){
         String sql;
         switch(indice){
             case 1:
                 sql = "delete from cliente where cpf in (?);";
                 break;
             case 2:
                 sql = "delete from funcionario where cpf in (?);";
                 break;
            default:
                sql ="";
                break;
         }
         PreparedStatement estado=null;
         
         ConectarDrive();
         
         try {
            for (String p : cpf) {
                String row = p;
                estado=conectar.prepareStatement(sql);
                estado.setString(1, row);
                estado.execute();
            }
            JOptionPane.showMessageDialog(null, "Cliente(s) deletado(s) com sucesso");
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao deletar","error", JOptionPane.ERROR_MESSAGE);
         }finally{
             try {
                 estado.close();
                 FecharConexao();
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "Erro ao fechar", "ERRO", JOptionPane.ERROR_MESSAGE);
             }
         }
     }

    public void DeleteCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
