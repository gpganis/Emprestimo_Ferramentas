package modelo;

import dao.AmigoDAO;
import java.util.ArrayList;

public class Amigo {

    private int id;
    /**
     * Variável para armazenar o ID do amigo
     */
    private String nome, telefone;
    /**
     * Variáveis para armazenar o nome e o telefone do amigo
     */
    private AmigoDAO dao;
    /**
     * Variável para acessar os métodos da classe AmigoDAO
     */

    /**
     * Construtor padrão da classe Amigo
     */
    public Amigo() {
        this(0, "", "");
        /**
         * Chama o construtor sobrecarregado passando valores padrão
         */
    }

    /**
     * Construtor sobrecarregado da classe Amigo
     * @param id
     * @param nome
     * @param telefone 
     */
    public Amigo(int id, String nome, String telefone) {
        this.nome = nome;
        /**
         * Inicializa o nome do amigo
         */
        this.telefone = telefone;
        /**
         * Inicializa o telefone do amigo
         */
        this.id = id;
        /**
         * Inicializa o ID do amigo
         */
        dao = new AmigoDAO();
        /**
         * Inicializa o objeto AmigoDAO para interagir com o banco de dados
         */
    }

     /**
      * Métodos getters e setters para os atributos da classe Amigo
      * @return 
      */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Método para obter a lista de amigos do banco de dados
     * @return 
     */
    public ArrayList<Amigo> getListaAmigos() {
        return dao.getMinhaLista();
    }

    /**
     * Método para inserir um novo amigo no banco de dados
     * @param nome
     * @param telefone
     * @return 
     */
    public boolean inserirAmigo(String nome, String telefone) {
        id = dao.maiorId() + 1;
        /**
         * Obtém o próximo ID disponível
         */
        Amigo objeto = new Amigo(id, nome, telefone);
        /**
         * Cria um novo objeto Amigo
         */
        dao.inserirAmigoBD(objeto);
        /**
         * Insere o amigo no banco de dados
         */
        return true; // Retorna true para indicar sucesso na inserção
    }

    /**
     * Método para apagar um amigo do banco de dados
     * @param id
     * @return 
     */
    public boolean apagarAmigo(int id) {
        dao.apagarAmigoBD(id);
        /**
         * Apaga o amigo do banco de dados
         */
        return true;
        /**
         * Retorna true para indicar sucesso na exclusão
         */
    }

    /**
     * Método para alterar os dados de um amigo no banco de dados
     * @param id
     * @param nome
     * @param telefone
     * @return 
     */
    public boolean alterarAmigo(int id, String nome, String telefone) {
        Amigo objeto = new Amigo(id, nome, telefone);
        /**
         * Cria um novo objeto Amigo com os dados atualizados
         */
        dao.alterarAmigoBD(objeto);
        /**
         * Altera os dados do amigo no banco de dados
         */
        return true;
        /**
         * Retorna true para indicar sucesso na alteração
         */
    }

    /**
     * Método para carregar os dados de um amigo do banco de dados
     * @param id
     * @return 
     */
    public Amigo carregarAmigo(int id) {
        return dao.carregarAmigoBD(id);
    /**
     * Carrega os dados do amigo do banco de dados e retorna o objeto Amigo correspondente
     */    
    }

}