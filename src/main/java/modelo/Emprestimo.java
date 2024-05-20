package modelo;

import dao.EmprestimoDAO;
import java.sql.Date;
import java.util.ArrayList;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean entregue;
    private int id, idAmg;
    private EmprestimoDAO dao;

    public Emprestimo() {
        this(null, null, false, 0, 0);
    }

    public Emprestimo(Date dataEmprestimo, Date dataDevolucao, boolean entregue, int id, int idAmg) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.entregue = entregue;
        this.id = id;
        this.idAmg = idAmg;

    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isEntregue() {
        return entregue;
    }

    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAmg() {
        return idAmg;
    }

    public void setIdAmg(int idAmg) {
        this.idAmg = idAmg;
    }

    public ArrayList<Emprestimo> getListaEmprestimos() {
        return dao.getMinhaLista();
    }

    public boolean inserirEmprestimo(Date dataEmprestimo, Date dataDevolucao, boolean entregue, int idAmg) {
        id = dao.maiorId() + 1;
        Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, entregue, id, idAmg);
        dao.inserirEmprestimoBD(objeto);
        return true;
    }

    public boolean apagarEmprestimo(int id) {
        dao.apagarEmprestimoBD(id);
        return true;
    }

    public boolean alterarEmprestimo(Date dataEmprestimo, Date dataDevolucao, boolean entregue, int id, int idAmg) {
        Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, entregue, id, idAmg);
        dao.alterarEmprestimoBD(objeto);
        return true;
    }

    public Emprestimo carregarEmprestimo(int id) {
        return dao.carregarEmprestimoBD(id);

    }
}
