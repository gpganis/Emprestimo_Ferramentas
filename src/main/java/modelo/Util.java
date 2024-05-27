package modelo;

import com.google.protobuf.TextFormat;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Util {

    public static Date dataAtual() {
        LocalDate hoje = LocalDate.now();
        return Date.valueOf(hoje);
    }

    public static Date stringParaDateSQL(String dataString) throws TextFormat.ParseException, java.text.ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dataUtil = formato.parse(dataString);
        return new Date(dataUtil.getTime());
    }
    
    public static String formatarNumero(String numero) {
        Pattern pattern = Pattern.compile("(\\d{2})(\\d{5})(\\d{4})");
        Matcher matcher = pattern.matcher(numero);

        if (matcher.matches()) {
            String numeroFormatado = "(" + matcher.group(1) + ")" + matcher.group(2) + "-" + matcher.group(3);
            return numeroFormatado;
        } else {
            return numero;
        }
    }
}
