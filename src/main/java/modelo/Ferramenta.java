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

    public ArrayList<Ferramenta> getListaFerramentas() {
        return dao.getMinhaLista();
    }

    public boolean inserirFerramenta(String nome, String marca, double custoAquisicao) {
        id = dao.maiorId() + 1;
        Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.inserirFerramentaBD(objeto);
        return true;
    }

    public boolean apagarFerramenta(int id) {
        dao.apagarFerramentaBD(id);
        return true;
    }

    public boolean alterarFerramenta(int id, String nome, String marca, double custoAquisicao) {
        Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);
        dao.alterarFerramentaBD(objeto);
        return true;
    }

    public Ferramenta carregarFerramenta(int id) {
        return dao.carregarFerramenta(id);
    }
}
