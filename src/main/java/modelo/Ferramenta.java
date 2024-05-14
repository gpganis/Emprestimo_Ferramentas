package modelo;

public class Ferramenta {

    private String nome, marca;
    private double custoAquisicao
    private int id;

    public Ferramenta() {

    }

    public Ferramenta(String nome, String marca, double custoAquisicao, int id) {
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
