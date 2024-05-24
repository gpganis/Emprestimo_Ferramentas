package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO {

    public static ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<>();
    
    public ArrayList<Emprestimo> ListaEmprestimosAtivos = new ArrayList<>();
    
    private ConexaoDAO connect;

    public ArrayList<Emprestimo> getMinhaLista() {

        ListaEmprestimos.clear();

        try {
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos");
            while (res.next()) {

                int id = res.getInt("id_emprestimo");
                int idAmg = res.getInt("id_amigo");
                Date dataEmprestimo = res.getDate("data_emprestimo");
                Date dataDevolucao = res.getDate("data_devolucao");
                boolean entregue = res.getBoolean("entregue");

                Emprestimo objeto = new Emprestimo(dataEmprestimo, dataDevolucao, entregue, id, idAmg);

                ListaEmprestimos.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return ListaEmprestimos;
    }

    public int maiorId() {
        int maiorId = 0;
        try {
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) id FROM tb_emprestimos");
            res.next();
            maiorId = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorId;
    }
    
    public boolean inserirEmprestimoBD(Emprestimo objeto) {
        String sql = "INSERT INTO tb_emprestimos(id_emprestimo,id_amigo,data_emprestimo, data_devolucao, entregue) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setInt(2, objeto.getIdAmg());
            stmt.setDate(3, objeto.getDataEmprestimo());
            stmt.setDate(4, objeto.getDataDevolucao());           
            stmt.setBoolean(5, objeto.isEntregue());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean apagarEmprestimoBD(int id) {
        try {
            Statement stmt = connect.getConexao().createStatement();

            stmt.executeUpdate("DELETE FROM tb_emprestimos WHERE id_emprestimo = " + id);

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    public boolean alterarEmprestimoBD(Emprestimo objeto) {
        String sql = "UPDATE tb_emprestimos set data_devolucao = ?, entregue = ? WHERE id_emprestimo = ?";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            stmt.setDate(1, objeto.getDataDevolucao());
            stmt.setBoolean(2, objeto.isEntregue());
            stmt.setInt(3, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public Emprestimo carregarEmprestimoBD(int id) {
        Emprestimo objeto = new Emprestimo();
        objeto.setId(id);
        try {
            Statement stmt = connect.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE id_emprestimo = " + id);
            res.next();

            objeto.setIdAmg(res.getInt("id_amigo"));
            objeto.setDataEmprestimo(res.getDate("data_emprestimo"));
            objeto.setDataDevolucao(res.getDate("data_devolucao"));
            objeto.setEntregue(res.getBoolean("entregue"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
    
    public ArrayList<Emprestimo> getEmprestimosAtivos() {

        ListaEmprestimosAtivos.clear();

        try {
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_emprestimos WHERE entregue is false");
            while (res.next()) {

                int id = res.getInt("id_emprestimo");
                Date data_emp = res.getDate("data_emprestimo");
                Date data_dev = res.getDate("data_devolucao");
                boolean entregue = res.getBoolean("entregue");
                int idEmp = res.getInt("id_amigo");

                Emprestimo objeto = new Emprestimo(data_emp, data_dev, entregue, id, idEmp);

                ListaEmprestimosAtivos.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return ListaEmprestimosAtivos;
    }
}
