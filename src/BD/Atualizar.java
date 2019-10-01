/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Atualizar extends ConexaoBD{
    
    public void AtualizaDados(String senha, String login){
        
        String sql = "update funcionario set senha=? where login=\""+login+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, senha);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
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
    public void AtualizProduto(String codigo,String nome, double preco, String marca, int quantidade, String data){
        
        String sql = "update produto set nome=?, preco=?, marca=?, quantidade=?, validade=? where codigo=\""+codigo+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setDouble(2, preco);
            estado.setString(3, marca);
            estado.setInt(4, quantidade);
            estado.setString(5, data);
            estado.execute();
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
    public void AtualizCliente(String cpf,String nome, String tel, String rua, int casa, String bairro, String compl){
        
        String sql = "update cliente set nome=?, tel=?, rua=?, bairro=?, numero=?, complemento=? where cpf=\""+cpf+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setString(2, tel);
            estado.setString(3, rua);
            estado.setString(4, bairro);
            estado.setInt(5, casa);
            estado.setString(6,compl);
            estado.execute();
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
    public void AtualizFun(String cpf,String nome, String data, String tel, String login){
        
        String sql = "update funcionario set nome=?, data_contrato=?, tel=?, login=? where cpf=\""+cpf+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setString(2, data);
            estado.setString(3, tel);
            estado.setString(4, login);
            estado.execute();
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
    public void AtualizaVenda(int id, boolean entrega){
        
        String sql = "update venda set entrega=? where id=\""+id+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setBoolean(1, entrega);
            estado.execute();
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
    public void AtualizCaixa(String data, double valor_inicial, double valor_final, double lucro){
        
        String sql = "update caixa set valor_inicial=?, valor_final=?, lucro=? where data=\""+data+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setDouble(1, valor_inicial);
            estado.setDouble(2, valor_final);
            estado.setDouble(3, lucro);
            estado.execute();
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
    public void AtualizaData(String data, String login){
        
        String sql = "update funcionario set data_caixa=? where login=\""+login+"\";";
        
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, data);
            estado.execute();
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
