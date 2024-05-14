package dao;

import java.sql.*;
import java.util.ArrayList;
import modelo.Ferramenta;

public class FerramentaDAO {

    
    public ArrayList<Ferramenta> ListaFerramentas = new ArrayList<>();

    public ArrayList<Ferramenta> getMinhaLista() {
        
        ListaFerramentas.clear();
        
        try {
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_ferramentas");
            while (res.next()) {
                
                int id = res.getInt("id_ferramentas");
                String nome = res.getString("nome");
                String marca = res.getString("marca");
                double custoAquisicao = Double.parseDouble(res.getString("custoAquisicao"));
                
                Ferramenta objeto = new Ferramenta(id, nome, marca, custoAquisicao);
                
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
            Statement stmt = this.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_ferramentas) id FROM tb_ferramentas");
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
}
