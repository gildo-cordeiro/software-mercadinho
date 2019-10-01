package BD;

import CLASSES.Funcionario;
import CLASSES.Venda;
import CLASSES.Cliente;
import CLASSES.produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Consultas extends ConexaoBD{
    public static String log;
    
    //Venda
    public ArrayList<Cliente> ComboBox(){
        ArrayList list = new ArrayList();
        PreparedStatement estado = null;
        
        String sql = "select cpf,nome from cliente";
        
        ConectarDrive();
        
       try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {   
                Cliente at = new Cliente();
                at.setNome(result.getString("nome"));
                at.setCpf(result.getString("cpf"));
                list.add(at);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não existe clientes cadastrados");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
       return list;
    }
    
    //Login
    public ArrayList<Funcionario> VerificarGerente(String login){
        ArrayList<Funcionario> list = new ArrayList();
        PreparedStatement estado = null;
        
        String sql = "select gerente,nome from funcionario where login = \""+login+"\";";
        
        ConectarDrive();
        
       try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {   
                Funcionario at = new Funcionario();
                at.setGer(result.getBoolean("gerente"));
                at.setNomeFun(result.getString("nome"));
                list.add(at);
            }else{
                JOptionPane.showMessageDialog(null, "Gerente não existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao verificar Gerente");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
       return list;
    }
    
    //Resgatar Senha
    public ArrayList<Funcionario> ResgatarPassword(String login){
        ArrayList<Funcionario> list = new ArrayList();
        PreparedStatement estado = null;
        String sql = "select senha from funcionario where login = \""+login+"\";";
        
        ConectarDrive();
        try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {   
                Funcionario at = new Funcionario();
                at.setSenha(result.getString("senha"));
                list.add(at);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario não existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar senha!");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return list;
    }
    
    //Login
    public boolean entrarLogin(String login, String senha){
        PreparedStatement estado = null;
        
        String sql = "select *from funcionario where login = \""+login+"\" and senha = \""+senha+"\";";
        
        ConectarDrive();
        
       try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
             if (result.next()) {   
                log = result.getString("cpf");
                 return true;
            }else{
                return false;
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao entrar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
       return false;
    }
    
    //Estoque
    public ArrayList<produto> ConsultarProduto(){
        ArrayList<produto> List = new ArrayList<>();
        String sql = "SELECT *FROM produto ORDER BY nome ASC;";
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                produto prod = new produto();
                prod.setId(result.getInt("id_prod"));
                prod.setCodigo(result.getString("codigo"));
                prod.setNome(result.getString("nome"));
                prod.setPreco(result.getDouble("preco"));
                prod.setMarca(result.getString("marca"));
                prod.setQuantidade(result.getInt("quantidade"));
                prod.setValidade(result.getString("validade"));
                List.add(prod);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    //Venda
    public ArrayList<produto> VenderProduto(String Codigo){
        ArrayList<produto> List = new ArrayList<>();
        String sql = "select *from produto where codigo=\""+Codigo+"\";";
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {                
                produto prod = new produto();
                //prod.setId(result.getInt("id_prod"));
                prod.setCodigo(result.getString("codigo"));
                prod.setNome(result.getString("nome"));
                prod.setPreco(result.getDouble("preco"));
                prod.setMarca(result.getString("marca"));
                //prod.setQuantidade(result.getInt("quantidade"));
                //prod.setValidade(result.getString("validade"));
                List.add(prod);
            }else{
                JOptionPane.showMessageDialog(null, "O porduto não existe no estoque!","Advertência",JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }    
    
    //Historico
    public ArrayList<Venda> ConsultarHistorico(){
        ArrayList<Venda> List = new ArrayList<>();
        String sql = "select venda.id,funcionario.cpf,venda.cpf_cl,venda.entrega,produto.nome,produto.marca,produto.preco,venda.quant,venda.data from "
                + "venda,produto,funcionario where venda.cpf_fun=funcionario.cpf and venda.codi=produto.codigo;";
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                Venda prod = new Venda();
                prod.setId(result.getInt("venda.id"));
                prod.setCpf_fun(result.getString("funcionario.cpf"));
                prod.setCpf_cl(result.getString("venda.cpf_cl"));
                prod.setNomeProd(result.getString("produto.nome"));
                prod.setMarca(result.getString("produto.marca"));
                prod.setValor(result.getDouble("produto.preco"));
                prod.setQuant(result.getInt("venda.quant"));
                prod.setData(result.getString("venda.data"));
                prod.setCheck(result.getBoolean("venda.entrega"));
                List.add(prod);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ainda não ha histórico de vendas");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    //venda
    public ArrayList<produto> ConsultarVenda(String Codigo){
        ArrayList<produto> List = new ArrayList<>();
        String sql = "select *from produto where codigo=\""+Codigo+"\";";
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                produto prod = new produto();
                //prod.setId(result.getInt("id_prod"));
                prod.setCodigo(result.getString("codigo"));
                prod.setNome(result.getString("nome"));
                prod.setPreco(result.getDouble("preco"));
                prod.setMarca(result.getString("marca"));
                //prod.setQuantidade(result.getInt("quantidade"));
                //prod.setValidade(result.getString("validade"));
                List.add(prod);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "não existe produtos cadastrados");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    //Estoque
    public ArrayList<produto> ConsultarProduto(String nome, String marca, int indice){
        ArrayList<produto> List = new ArrayList<>();
        String sql;
        switch (indice) {
            case 0:
                sql = "SELECT * FROM produto WHERE nome LIKE \"%"+nome+"%\"ORDER BY nome ASC;";
                break;
            case 1:
                sql = "SELECT * FROM produto WHERE marca LIKE \"%"+marca+"%\"ORDER BY nome ASC;";
                break;
            default:
                sql = "SELECT * FROM produto ORDER BY nome ASC;";
                break;
        }
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                produto prod = new produto();
                prod.setId(result.getInt("id_prod"));
                prod.setCodigo(result.getString("codigo"));
                prod.setMarca(result.getString("marca"));
                prod.setNome(result.getString("nome"));
                prod.setPreco(result.getDouble("preco"));
                prod.setQuantidade(result.getInt("quantidade"));
                prod.setValidade(result.getString("validade"));
                List.add(prod);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    //Clientes Cadastrados
    public ArrayList<Cliente> ConsultarPessoa(){
        ArrayList<Cliente> List = new ArrayList<>();
        PreparedStatement estado=null;
        
        String sql = "select *from cliente;";
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet Result = estado.executeQuery(sql);
            while(Result.next()){
                Cliente dados = new Cliente();
                dados.setCpf(Result.getString("cpf"));
                dados.setNome(Result.getString("nome"));
                dados.setTelefone(Result.getString("tel"));
                dados.setRua(Result.getString("rua"));
                dados.setBairro(Result.getString("bairro"));
                dados.setNum_casa(Result.getInt("numero"));
                dados.setComplemento(Result.getString("complemento"));
                List.add(dados);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    public ArrayList<Funcionario> ConsultarFun(){
        ArrayList<Funcionario> List = new ArrayList<>();
        PreparedStatement estado=null;
        
        String sql = "select *from funcionario;";
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet Result = estado.executeQuery(sql);
            while(Result.next()){
                Funcionario dados = new Funcionario();
                dados.setCpf_fun(Result.getString("cpf"));
                dados.setNome(Result.getString("nome"));
                dados.setData(Result.getString("data_contrato"));
                dados.setTel(Result.getString("tel"));
                dados.setLogin(Result.getString("login"));
                List.add(dados);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    //Clientes Cadastrados
    public ArrayList<Cliente> ConsultarPessoa(String nome){
        ArrayList<Cliente> List = new ArrayList<>();
        PreparedStatement estado=null;
        
        String sql = "SELECT * FROM cliente WHERE nome LIKE \""+nome+"%\";";
        
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet Result = estado.executeQuery(sql);
            while(Result.next()){
                Cliente dados = new Cliente();
                dados.setCpf(Result.getString("cpf"));
                dados.setNome(Result.getString("nome"));
                dados.setTelefone(Result.getString("tel"));
                dados.setRua(Result.getString("rua"));
                dados.setBairro(Result.getString("bairro"));
                dados.setNum_casa(Result.getInt("numero"));
                dados.setComplemento(Result.getString("complemento"));
                List.add(dados);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    
    public ArrayList<Venda> ConsultarHistorico(String cpf_cl,String cpf_fun, String nome, int indice){
        ArrayList<Venda> List = new ArrayList<>();
        String sql;
        switch (indice) {
            case 0:
                sql = "SELECT venda.id,funcionario.cpf,venda.cpf_cl,produto.nome,produto.marca,produto.preco,venda.quant,venda.data FROM venda JOIN produto ON venda.codi=produto.codigo "
                        + "JOIN funcionario ON venda.cpf_fun=funcionario.cpf  WHERE "
                        + "venda.cpf_cl LIKE \""+cpf_cl+"\";";
                break;
            case 1:
                sql = "SELECT venda.id,funcionario.cpf,venda.cpf_cl,produto.nome,produto.marca,produto.preco,venda.quant,venda.data FROM venda JOIN produto ON venda.codi=produto.codigo "
                        + "JOIN funcionario ON venda.cpf_fun=funcionario.cpf  WHERE "
                        + "venda.cpf_fun LIKE \""+cpf_fun+"\";";
                break;
            case 2:
                sql = "SELECT venda.id,funcionario.cpf,venda.cpf_cl,produto.nome,produto.marca,produto.preco,venda.quant,venda.data FROM venda JOIN produto ON venda.codi=produto.codigo "
                        + "JOIN funcionario ON venda.cpf_fun=funcionario.cpf  WHERE "
                        + "produto.nome LIKE \""+nome+"%\";";
                break;
            default:
                sql = "SELECT * FROM produto;";
                break;
        }
        
        PreparedStatement estado = null;
        ConectarDrive();
        
        try {
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {                
                Venda prod = new Venda();
                prod.setId(result.getInt("venda.id"));
                prod.setCpf_fun(result.getString("funcionario.cpf"));
                prod.setCpf_cl(result.getString("venda.cpf_cl"));
                prod.setNomeProd(result.getString("produto.nome"));
                prod.setMarca(result.getString("produto.marca"));
                prod.setValor(result.getDouble("produto.preco"));
                prod.setQuant(result.getInt("venda.quant"));
                prod.setData(result.getString("venda.data"));
                List.add(prod);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return List;
    }
    public ArrayList<Funcionario> ResgatarData(String cpf){
        ArrayList<Funcionario> list = new ArrayList();
        PreparedStatement estado = null;
        String sql = "select data_caixa from funcionario where cpf = \""+cpf+"\";";
        
        ConectarDrive();
        try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            if (result.next()) {   
                Funcionario at = new Funcionario();
                at.setData(result.getString("data_caixa"));
                list.add(at);
            }else{
                JOptionPane.showMessageDialog(null, "Data inexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar data!");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return list;
    }
    
    public ArrayList<Venda> ConsultarCaixa(){
        ArrayList list = new ArrayList();
        PreparedStatement estado = null;
        String sql = "select funcionario.nome,funcionario.cpf,caixa.data, caixa.valor_inicial, caixa.valor_final, caixa.lucro "
                + "from caixa,funcionario where caixa.cpf_caixa=funcionario.cpf;";
        
        ConectarDrive();
        try {        
            estado = conectar.prepareStatement(sql);
            ResultSet result = estado.executeQuery(sql);
            while (result.next()) {   
                Venda at = new Venda();
                at.setCpf_fun(result.getString("funcionario.nome"));
                at.setData(result.getString("caixa.data"));
                at.setValor(result.getDouble("caixa.valor_inicial"));
                at.setValor_final(result.getDouble("caixa.valor_final"));
                at.setLucro(result.getDouble("caixa.lucro"));
                list.add(at);
            }
            //JOptionPane.showMessageDialog(null, "Data inexistente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar data!");
        }finally{
            try {
                estado.close();
                FecharConexao();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar conexão;", null, JOptionPane.WARNING_MESSAGE);
            }
        }
        return list;
    }
}
