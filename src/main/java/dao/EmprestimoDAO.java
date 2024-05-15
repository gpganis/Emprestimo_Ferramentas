package dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.Emprestimo;

public class EmprestimoDAO {

    public static ArrayList<Emprestimo> ListaEmprestimos = new ArrayList<>();

    public ArrayList<Emprestimo> getMinhaLista() {

        ListaEmprestimos.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
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
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_emprestimo) id FROM tb_emprestimos");
            res.next();
            maiorId = res.getInt("id");
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return maiorId;
    }

    public Connection getConexao() {

        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);

            String server = "localhost";
            String database = "Database";
            String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "my_user";
            String password = "my_user";

            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Status: Conectado!");
            } else {
                System.out.println("Status: Não Conectado!");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar...");
            return null;
        }
    }
}
