
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDAO {

    // Esta classe gerencia a conexão com o banco de dados MySQL.

    private static Connection connection = null; // Instância de conexão estática para garantir uma única conexão.

    // Método para obter a conexão com o banco de dados.
    public static Connection getConexao() {

        // Verifica se a conexão ainda não foi estabelecida.
        if (connection == null) {
            try {
                // Carrega o driver JDBC MySQL.
                String driver = "com.mysql.cj.jdbc.Driver";
                Class.forName(driver);

                // Detalhes para a conexão com o banco de dados.
                String server = "localhost"; // Servidor onde o banco de dados está hospedado.
                String database = "Database"; // Nome do banco de dados.
                String url = "jdbc:mysql://" + server + ":3306/" + database + "?useTimezone=true&serverTimezone=UTC"; // URL de conexão.
                String user = "root"; // Nome de usuário do banco de dados.
                String password = "Unisul@1520"; // Senha do banco de dados.

                // Estabelece a conexão com o banco de dados.
                connection = DriverManager.getConnection(url, user, password);

                // Verifica se a conexão foi estabelecida com sucesso.
                if (connection != null) {
                    System.out.println("Status: Conectado!"); // Imprime mensagem indicando conexão bem-sucedida.
                } else {
                    System.out.println("Status: Não Conectado!"); // Imprime mensagem indicando falha na conexão.
                }
                return connection; // Retorna a conexão estabelecida.

            } catch (ClassNotFoundException e) {
                System.out.println("O driver não foi encontrado."); // Imprime mensagem de erro se o driver não for encontrado.
                return null;
            } catch (SQLException e) {
                System.out.println("Não foi possível conectar..."); // Imprime mensagem de erro se a conexão falhar.
                return null;
            }
        }
        return connection; // Retorna a conexão existente.
    }
}