package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    private static Connection connection = null;

    public static Connection getConexao() {

        if (connection == null) {
            try {
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);

                String server = "localhost";
                String database = "Database";
                String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC";
                String user = "root";
                String password = "Unisul@1520";

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
        return connection;
    }   
}