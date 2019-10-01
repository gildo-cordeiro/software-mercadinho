package BD;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cadastro extends ConexaoBD{
    
    public void CadastrarGerente(String cpf, String nome, String contrato, String tel, boolean gerente,String login, String senha){
        String sql = "insert into funcionario (cpf,nome, data_contrato,tel,gerente,login,senha) values (?,?,?,?,?,?,?);";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, cpf);
            estado.setString(2, nome);
            estado.setString(3, tel);
            estado.setString(4, contrato);
            estado.setBoolean(5, gerente);
            estado.setString(6,login);
            estado.setString(7,senha);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void CadastrarClientes(String cpf, String nome, String tel, String rua, String bairro, int numero, String complemento){
        String sql = "insert into cliente(cpf, nome, tel, rua, bairro, numero, complemento) values (?,?,?,?,?,?,?);";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, cpf);
            estado.setString(2, nome);
            estado.setString(3, tel);
            estado.setString(4, rua);
            estado.setString(5, bairro);
            estado.setInt(6, numero);
            estado.setString(7, complemento);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void CadastrarProduto(String nome, double preco, String marca, int quantidade, String data,String codigo){
        String sql= "insert into produto(nome, preco, marca, quantidade, validade,codigo) values(?,?,?,?,?,?)";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, nome);
            estado.setDouble(2, preco);
            estado.setString(3, marca);
            estado.setInt(4, quantidade);
            estado.setString(5, data);
            estado.setString(6, codigo);
            estado.execute();
            JOptionPane.showMessageDialog(null, "Produto cadastrado.", null, JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto, por favor verifique os dados.", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
      
    public void CadastrarVenda(String cpf_fun,String cpf_cli,String codi, int quantidade,String Data){
        String sql = "insert into venda(cpf_fun, cpf_cl, codi, quant, data,entrega) values (?,?,?,?,?,?);";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, cpf_fun);
            estado.setString(2, cpf_cli);
            estado.setString(3, codi);
            estado.setInt(4, quantidade);
            estado.setString(5, Data);
            estado.setBoolean(6, false);
            estado.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar xd", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public void CadastrarVendaSemCliente(String cpf_fun,String codi, int quantidade,String Data){
        String sql = "insert into venda(cpf_fun, codi, quant, data,entrega) values (?,?,?,?,?);";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, cpf_fun);
            estado.setString(2, codi);
            estado.setInt(3, quantidade);
            estado.setString(4, Data);
            estado.setBoolean(5, false);
            estado.execute();
            //JOptionPane.showMessageDialog(null, "Finalizado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar (Sem cliente);", null, JOptionPane.WARNING_MESSAGE);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public boolean CadastrarCaixa(String data, double valor_inicial,double valor_final,double lucro,String cpf){
        String sql = "insert into caixa(data,valor_inicial,valor_final,lucro,cpf_caixa) values(?,?,?,?,?);";
        PreparedStatement estado = null;
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            estado.setString(1, data);
            estado.setDouble(2, valor_inicial);
            estado.setDouble(3, valor_final);
            estado.setDouble(4, lucro);
            estado.setString(5, cpf);
            estado.execute();
            return true;
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao cadastrar;", null, JOptionPane.WARNING_MESSAGE);
            return false;
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}

