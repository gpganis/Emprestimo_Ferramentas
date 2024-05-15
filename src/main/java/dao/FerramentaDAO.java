package dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDAO {

    public ArrayList<Ferramenta> ListaFerramentas = new ArrayList<>();
    
    private ConexaoDAO connect;
    
    public ArrayList<Ferramenta> getMinhaLista() {

        ListaFerramentas.clear();

        try {
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {

                int id = res.getInt("id_ferramenta");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custoAquisicao = Double.parseDouble(res.getString("custo_aquisicao"));
                int idEmp = res.getInt("id_emprestimo");

                Ferramenta objeto = new Ferramenta(nome, marca, custoAquisicao, id, idEmp);

                ListaFerramentas.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return ListaFerramentas;
    }

    public int maiorId() {
        int maiorId = 0;
        try {
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramenta) id FROM tb_ferramentas");
            res.next();
            maiorId = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorId;
    }

    public boolean inserirFerramentaBD(Ferramenta objeto) {
        String sql = "INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao, id_emprestimo) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getMarca());
            stmt.setDouble(4, objeto.getCustoAquisicao());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean apagarFerramentaBD(int id) {
        try {
            Statement stmt = connect.getConexao().createStatement();

            stmt.executeUpdate("DELETE FROM tb_ferramentas WHERE id_ferramenta =" + id);

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    public boolean alterarFerramentaBD(Ferramenta objeto) {
        String sql = "UPDATE tb_ferramentas set nome = ?, marca = ?, custo_aquisicao = ? WHERE id_ferramenta = ?";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getMarca());
            stmt.setDouble(3, objeto.getCustoAquisicao());
            stmt.setInt(4, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public Ferramenta carregarFerramenta(int id) {
        Ferramenta objeto = new Ferramenta();
        objeto.setId(id);
        try {
            Statement stmt = connect.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas WHERE id_ferramenta = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setMarca(res.getString("marca"));
            objeto.setCustoAquisicao(res.getDouble("custo_aquisicao"));
            objeto.setIdEmp(res.getInt("id_emprestimo"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}
