package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Amigo;

/**
 * Classe responsável pela interação com o banco de dados para operações relacionadas aos amigos
 */
public class AmigoDAO {

    /**
     * Lista de amigos
     */
    public ArrayList<Amigo> ListaAmigos = new ArrayList<>();

    /**
     * Objeto para conexão com o banco de dados 
     */
    private ConexaoDAO connect;

    /**
     * Método para obter a lista de amigos do banco de dados
     */
    public ArrayList<Amigo> getMinhaLista() {

        /**
         * Limpa a lista de amigos antes de buscar novos dados
         */
        ListaAmigos.clear();

        try {
            /**
             * Cria um Statement para executar a consulta SQL
             */
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos");
            /**
             * Itera sobre o resultado da consulta
             */
            while (res.next()) {

                /**
                 * Obtém os dados de cada amigo do resultado da consulta
                 */
                int id = res.getInt("id_amigo");
                String nome = res.getString("nome");
                String telefone = res.getString("telefone");

                /**
                 * Cria um objeto Amigo com os dados obtidos e o adiciona à lista de amigos
                 */
                Amigo objeto = new Amigo(id, nome, telefone);
                ListaAmigos.add(objeto);
            }
            /**
             * Fecha o Statement
             */
            stmt.close();

        } catch (SQLException ex) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro:" + ex);
        }
        /**
         * Retorna a lista de amigos
         */
        return ListaAmigos;
    }

    /**
     * Método para obter o maior ID de amigo presente no banco de dados
     */
    public int maiorId() {
        int maiorId = 0;
        try {
            /**
             * Cria um Statement para executar a consulta SQL
             */
            Statement stmt = connect.getConexao().createStatement();
            ResultSet res = stmt.executeQuery("SELECT MAX(id_amigo) id FROM tb_amigos");
            res.next();
            maiorId = res.getInt("id");
            /**
             * Fecha o Statement
             */
            stmt.close();
        } catch (SQLException ex) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro: " + ex);
        }
        /**
         * Retorna o maior ID encontrado
         */
        return maiorId;
    }

    /**
     * Método para inserir um novo amigo no banco de dados
     * @param objeto
     * @return 
     */
    public boolean inserirAmigoBD(Amigo objeto) {
        String sql = "INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES(?,?,?)";
        try {
            /**
             * Prepara uma instrução SQL para inserção
             */
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            /**
             * Define os parâmetros da instrução SQL com os dados do amigo
             */
            stmt.setInt(1, objeto.getId());
            stmt.setString(2, objeto.getNome());
            stmt.setString(3, objeto.getTelefone());

            /**
             * Executa a instrução SQL
             */
            stmt.execute();
            /**
             * Fecha a instrução
             */
            stmt.close();

            return true;
        } catch (SQLException erro) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro: " + erro);
            /**
             * Lança uma exceção
             */
            throw new RuntimeException(erro);
        }
    }

    /**
     * Método para apagar um amigo do banco de dados dado seu ID
     * @param id
     * @return 
     */
    public boolean apagarAmigoBD(int id) {
        try {
            /**
             * Cria um Statement para executar a instrução SQL de exclusão
             */
            Statement stmt = connect.getConexao().createStatement();

            /**
             * Executa a instrução SQL de exclusão
             */
            stmt.executeUpdate("DELETE FROM tb_amigos WHERE id_amigo =" + id);

            /**
             * Fecha o Statement
             */
            stmt.close();
        } catch (SQLException erro) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro: " + erro);
        }
        /**
         * Retorna verdadeiro, indicando que a operação foi concluída com sucesso
         */
        return true;
    }

    /**
     * Método para alterar os dados de um amigo no banco de dados
     * @param objeto
     * @return 
     */
    public boolean alterarAmigoBD(Amigo objeto) {
        String sql = "UPDATE tb_amigos set nome = ?, telefone = ? WHERE id_amigo = ?";
        try {
            /**
             * Prepara uma instrução SQL para atualização
             */
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            /**
             * Define os parâmetros da instrução SQL com os novos dados do amigo
             */
            stmt.setString(1, objeto.getNome());
            stmt.setString(2, objeto.getTelefone());
            stmt.setInt(3, objeto.getId());

            /**
             * Executa a instrução SQL
             */
            stmt.execute();
            /**
             * Fecha a instrução
             */
            stmt.close();

            return true;

        } catch (SQLException erro) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro: " + erro);
            /**
             * Lança uma exceção
             */
            throw new RuntimeException(erro);
        }
    }

    /**
     * Método para carregar os dados de um amigo do banco de dados dado seu ID
     * @param id
     * @return 
     */
    public Amigo carregarAmigoBD(int id) {
        Amigo objeto = new Amigo();
        objeto.setId(id);
        try {
            /**
             * Cria um Statement para executar a consulta SQL
             */
            Statement stmt = connect.getConexao().createStatement();

            /**
             * Executa a consulta SQL para obter os dados do amigo
             */
            ResultSet res = stmt.executeQuery("SELECT * FROM tb_amigos WHERE id_amigo = " + id);
            res.next();

            /**
             * Define os dados do amigo no objeto Amigo
             */
            objeto.setNome(res.getString("nome"));
            objeto.setTelefone(res.getString("telefone"));

            /**
             * Fecha o Statement
             */
            stmt.close();
        } catch (SQLException erro) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro:" + erro);
        }
        /**
         * Retorna o objeto Amigo carregado com os dados do banco de dados
         */
        return objeto;
    }

    /**
     * Método para obter o ID de um amigo pelo seu nome
     * @param nome
     * @return 
     */
    public static int getIdPeloNome(String nome) {
        int id = -1;

        try {
            /**
             * Prepara uma consulta SQL para obter o ID do amigo pelo nome
             */
            String query = "SELECT id_amigo FROM tb_amigos WHERE nome = ?";
            PreparedStatement statement = ConexaoDAO.getConexao().prepareStatement(query);
            statement.setString(1, nome);
            ResultSet resultSet = statement.executeQuery();

            /**
             * Se houver um resultado na consulta, obtém o ID
             */
            if (resultSet.next()) {
                id = resultSet.getInt("id_amigo");
            }
        } catch (SQLException ex) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro:" + ex);
        }

        /**
         * Retorna o ID obtido
         */
        return id;
    }

    /**
     * Método para verificar se um amigo possui empréstimos pendentes
     * @param id
     * @return 
     */
    public boolean verificarPendencia(int id) {

        try {
            /**
             * Cria um Statement para executar a consulta SQL
             */
            Statement stmt = connect.getConexao().createStatement();
            /**
             * Executa a consulta SQL para obter os empréstimos do amigo
             */
            ResultSet res = stmt.executeQuery("select id_amigo, entregue from tb_emprestimos;");
            while (res.next()) {

                /**
                 * Obtém os dados de cada empréstimo
                 */
                int idAmg = res.getInt("id_amigo");
                boolean entregue = res.getBoolean("entregue");

                /**
                 * Verifica se o amigo possui empréstimos pendentes
                 */
                if (idAmg == id && entregue == false) {
                    return true; // retorna que o amigo tem empréstimos pendentes
                }
            }
            /**
             * Fecha o Statement
             */
            stmt.close();

        } catch (SQLException ex) {
            /**
             * Em caso de erro, imprime o erro
             */
            System.out.println("Erro:" + ex);
        }
        /**
         * Retorna falso se não houver pendências
         */
        return false;
    }
}
