package modelo;

import dao.FerramentaDAO;
/**
 * Importa a classe FerramentaDAO do pacote dao
 */
import java.util.ArrayList;
/**
 * Importa a classe ArrayList do pacote java.util
 * @author Rennan
 */

public class Ferramenta {

    private String nome, marca;
    /**
     * Nome e marca da ferramenta
     */
    private double custoAquisicao;
    /**
     * Custo de aquisição da ferramenta
     */
    private int id, idEmp;
    /**
     * Identificadores da ferramenta e do empréstimo relacionado
     */
    private FerramentaDAO dao;
    /**
     * Objeto para acessar os métodos da classe FerramentaDAO
     */

    /**
     * Construtor padrão da classe Ferramenta
     */
    public Ferramenta() {
        this("", "", 0, 0, 0);
        /**
         * Chama o construtor sobrecarregado passando valores padrão
         */
    }

    /**
     * Construtor sobrecarregado da classe Ferramenta
     * @param nome
     * @param marca
     * @param custoAquisicao
     * @param id
     * @param idEmp 
     */
    public Ferramenta(String nome, String marca, double custoAquisicao, int id, int idEmp) {
        this.nome = nome;
        /**
         * Inicializa o nome da ferramenta
         */
        this.marca = marca;
        /**
         * Inicializa a marca da ferramenta
         */
        this.custoAquisicao = custoAquisicao;
        /**
         * Inicializa o custo de aquisição da ferramenta
         */
        this.id = id;
        /**
         * Inicializa o ID da ferramenta
         */
        this.idEmp = idEmp;
        /**
         * Inicializa o ID do empréstimo relacionado
         */
        dao = new FerramentaDAO();
        /**
         * Inicializa o objeto FerramentaDAO para interagir com o banco de dados
         */
    }

    /**
     * Métodos getters e setters para os atributos da classe Ferramenta
     * @return 
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCustoAquisicao() {
        return custoAquisicao;
    }

    public void setCustoAquisicao(double custoAquisicao) {
        this.custoAquisicao = custoAquisicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    /**
     * Método para obter a lista de ferramentas do banco de dados
     */
    public ArrayList<Ferramenta> getListaFerramentas() {
        return dao.getMinhaLista();
    }

    /**
     * Método para inserir uma nova ferramenta no banco de dados
     */
    public boolean inserirFerramenta(String nome, String marca, double custoAquisicao) {
        id = dao.maiorId() + 1;
        /**
         * Obtém o próximo ID disponível
         */
        Ferramenta objeto = new Ferramenta(nome, marca, custoAquisicao, id, idEmp);
        /**
         * Cria um novo objeto Ferramenta
         */
        dao.inserirFerramentaBD(objeto);
        /**
         * Insere a ferramenta no banco de dados
         */
        return true;
        /**
         * Retorna true para indicar sucesso na inserção
         */
    }

    /**
     * Método para apagar uma ferramenta do banco de dados
     * @param id
     * @return 
     */
    public boolean apagarFerramenta(int id) {
        dao.apagarFerramentaBD(id);
        /**
         * Apaga a ferramenta do banco de dados
         */
        return true;
        /**
         * Retorna true para indicar sucesso na exclusão
         */
    }

    /**
     * Método para alterar os dados de uma ferramenta no banco de dados
     * @param id
     * @param nome
     * @param marca
     * @param custoAquisicao
     * @return 
     */
    public boolean alterarFerramenta(int id, String nome, String marca, double custoAquisicao) {
        Ferramenta objeto = new Ferramenta(nome, marca, custoAquisicao, id, idEmp);
        /**
         * Cria um novo objeto Ferramenta com os dados atualizados
         */
        dao.alterarFerramentaBD(objeto);
        /**
         * Altera os dados da ferramenta no banco de dados
         */
        return true;
        /**
         * Retorna true para indicar sucesso na alteração
         */
    }

    /**
     * Método para carregar os dados de uma ferramenta do banco de dados
     * @param id
     * @return 
     */
    public Ferramenta carregarFerramenta(int id) {
        return dao.carregarFerramenta(id);
    /**
     * Carrega os dados da ferramenta do banco de dados e retorna o objeto Ferramenta correspondente
     */    
    }
}
