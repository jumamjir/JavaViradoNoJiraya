package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {

        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em Branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z,A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // \[]


//        String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0X109 0X1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }

    }
}
