/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASSES;

/**
 *
 * @author gildo
 */
public class Funcionario {
    private static boolean ger;
    private static String NomeFun;
    private String senha;
    private String cpf_fun;
    private String data;
    private String tel;
    private String login;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public String getCpf_fun() {
        return cpf_fun;
    }

    public void setCpf_fun(String cpf_fun) {
        this.cpf_fun = cpf_fun;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public boolean isGer() {
        return ger;
    }
    public void setGer(boolean ger) {
        this.ger = ger;
    }
    public String getNomeFun() {
        return NomeFun;
    }

    public void setNomeFun(String NomeFun) {
        this.NomeFun = NomeFun;
    }
}
