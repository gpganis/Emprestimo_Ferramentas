package modelo;

import java.sql.Date;

public class Emprestimo {

    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean entregue;
    private int id, idAmg;

    public Emprestimo() {
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
    
    
}
