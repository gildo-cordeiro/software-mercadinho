
package CLASSES;

public class Venda {
    private int id;
    private String cpf_cl;
    private String codi;
    private int quant;
    private double valor;
    private String NomeCl;
    private String marca;
    private String NomeProd;
    private double valor_final;
    private double lucro;
    private boolean check;
    private String data;
    private String cpf_fun;

    public String getCpf_fun() {
        return cpf_fun;
    }

    public void setCpf_fun(String cpf_fun) {
        this.cpf_fun = cpf_fun;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getValor_final() {
        return valor_final;
    }

    public void setValor_final(double valor_final) {
        this.valor_final = valor_final;
    }
    

    public String getNomeProd() {
        return NomeProd;
    }

    public void setNomeProd(String NomeProd) {
        this.NomeProd = NomeProd;
    }

    public String getNomeCl() {
        return NomeCl;
    }

    public void setNomeCl(String NomeCl) {
        this.NomeCl = NomeCl;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf_cl() {
        return cpf_cl;
    }

    public void setCpf_cl(String cpf_cl) {
        this.cpf_cl = cpf_cl;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
