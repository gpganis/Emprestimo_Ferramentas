package modelo;

import dao.FerramentaDAO;
import java.util.ArrayList;

public class Ferramenta {

    private String nome, marca;
    private double custoAquisicao;
    private int id, idEmp;
    private FerramentaDAO dao;

    public Ferramenta() {
        this("", "", 0, 0, 0);
    }

    public Ferramenta(String nome, String marca, double custoAquisicao, int id, int idEmp) {
        this.nome = nome;
        this.marca = marca;
        this.custoAquisicao = custoAquisicao;
        this.id = id;
        this.idEmp = idEmp;
        dao = new FerramentaDAO();
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

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public ArrayList<Ferramenta> getListaFerramentas() {
        return dao.getMinhaLista();
    }

    public boolean inserirFerramenta(String nome, String marca, double custoAquisicao) {
        id = dao.maiorId() + 1;
        Ferramenta objeto = new Ferramenta(nome, marca, custoAquisicao, id, idEmp);
        dao.inserirFerramentaBD(objeto);
        return true;
    }

    public boolean apagarFerramenta(int id) {
        dao.apagarFerramentaBD(id);
        return true;
    }

    public boolean alterarFerramenta(int id, String nome, String marca, double custoAquisicao) {
        Ferramenta objeto = new Ferramenta(nome, marca, custoAquisicao, id, idEmp);
        dao.alterarFerramentaBD(objeto);
        return true;
    }

    public Ferramenta carregarFerramenta(int id) {
        return dao.carregarFerramenta(id);
    }
}
