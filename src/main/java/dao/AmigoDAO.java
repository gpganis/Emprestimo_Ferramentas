package dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.Amigo;

public class AmigoDAO {

    public ArrayList<Amigo> ListaAmigos = new ArrayList<>();

    public ArrayList<Amigo> getMinhaLista() {

        ListaAmigos.clear();

        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            while (res.next()) {

                int id = res.getInt("id_amigos");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                Amigo objeto = new Amigo(id, nome, telefone);

                ListaAmigos.add(objeto);
            }
            stmt.close();

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
        }
        return ListaAmigos;
    }

    public int maiorId() {
        int maiorId = 0;
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_amigos) id FROM tb_amigos");
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
            String user = "root";
            String password = "root";

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

    public boolean inserirAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos(id_amigos,nome,telefone) VALUES(?,?,?)";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            stmt.execute();
            stmt.close();

            return true;
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public boolean apagarAmigoBD(int id) {
        try {
            Statement stmt = this.getConexao().createStatement();

            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id_amigos =" + id);

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
        }
        return true;
    }

    public boolean alterarAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigos set nome = ?, telefone = ? WHERE id_amigos = ?";
        try {
            PreparedStatement stmt = this.getConexao().prepareStatement(sql);

            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());

            stmt.execute();
            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }

    public Amigo carregarAmigoBD(int id) {
        Amigo objeto = new Amigo();
        objeto.setId(id);
        try {
            Statement stmt = this.getConexao().createStatement();

            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id_amigos = " + id);
            res.next();

            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getString("telefone"));

            stmt.close();
        } catch (SQLException erro) {
            System.out.println("Erro:" + erro);
        }
        return objeto;
    }
}

