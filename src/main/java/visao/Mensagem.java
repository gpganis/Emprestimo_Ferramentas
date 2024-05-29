package visao;

public class Mensagem extends Exception {

    // Construtor da classe Mensagem que recebe uma mensagem como parâmetro
    Mensagem(String msg) {
        super(msg); // Chama o construtor da classe Exception passando a mensagem como argumento
    }
}