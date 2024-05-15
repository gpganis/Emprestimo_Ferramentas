package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {

    private int id;
    private String nome, telefone;
    private AmigoDAO dao;

    public Amigo() {
        dao = new AmigoDAO();
    }

    public Amigo(int id, String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
        dao = new AmigoDAO();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Amigo> getListaAmigos() {
        return dao.getMinhaLista();
    }

    public boolean inserirAmigo(String nome, String telefone) {
        id = dao.maiorId() + 1;
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.inserirAmigoBD(objeto);
        return true;
    }

    public boolean apagarAmigo(int id) {
        dao.apagarAmigoBD(id);
        return true;
    }

    public boolean alterarAmigo(int id, String nome, String telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        dao.alterarAmigoBD(objeto);
        return true;
    }

    public Amigo carregarAmigo(int id) {
        return dao.carregarAmigoBD(id);
    }

}
