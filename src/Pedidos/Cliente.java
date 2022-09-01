package Pedidos;

public class Cliente {

    private String nome;
    private String rua;
    private String numero;

    private String bairro;

    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, String rua, String numero, String bairro, String telefone) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String  getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    }





