package modelo;

import com.google.protobuf.TextFormat;
/**
 * Importa a classe TextFormat do pacote com.google.protobuf
 */
import java.sql.Date;
/**
 * Importa a classe Date do pacote java.sql
 */
import java.text.SimpleDateFormat;
/**
 * Importa a classe SimpleDateFormat do pacote java.text
 */
import java.time.LocalDate;
/**
 * Importa a classe LocalDate do pacote java.time
 */
import java.util.regex.Matcher;
/**
 * Importa a classe Matcher do pacote java.util.regex
 */
import java.util.regex.Pattern;
/**
 * Importa a classe Pattern do pacote java.util.regex
 * @author Rennan
 */

public class Util {

    /**
     * Método para obter a data atual no formato SQL
     * @return 
     */
    public static Date dataAtual() {
        LocalDate hoje = LocalDate.now();
        /**
         * Obtém a data atual
         */
        return Date.valueOf(hoje);
        
    }

    /**
     * Método para converter uma string para um objeto Date no formato SQL
     * @param dataString
     * @return
     * @throws com.google.protobuf.TextFormat.ParseException
     * @throws java.text.ParseException 
     */
    public static Date stringParaDateSQL(String dataString) throws TextFormat.ParseException, java.text.ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        /**
         * Define o formato da data
         */
        java.util.Date dataUtil = formato.parse(dataString);
        /**
         * Converte a string para um objeto Date do Java
         */
        return new Date(dataUtil.getTime());
        /**
         * Retorna a data no formato SQL
         */
    }
    
    /**
     * Método para formatar um número de telefone
     * @param numero
     * @return 
     */
    public static String formatarNumero(String numero) {
        Pattern pattern = Pattern.compile("(\\d{2})(\\d{5})(\\d{4})");
        /**
         * Define o padrão do número de telefone
         */
        Matcher matcher = pattern.matcher(numero);
        /**
         * Cria um objeto Matcher para encontrar padrões na string
         */

        if (matcher.matches()) {
            /**
             * Se o padrão for encontrado na string
             */
            String numeroFormatado = "(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3);
            /**
             * Formata o número de telefone
             */
            return numeroFormatado;
            /**
             * Retorna o número de telefone formatado
             */
        } else {
            /**
             * Se o padrão não for encontrado na string
             */
            return numero;
            /**
             * Retorna a string original
             */
        }
    }
}
