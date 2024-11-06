package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {

        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em Branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-z,A-Z, dígitos, _
        // \W = Tudo o que não for incluso no \w
        // []
        // ? Zerou ou uma
        // * Zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // ()
        // |
        // $




        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0X10G 0X1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto:  " + texto);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex:  " + regex);
        System.out.println("Posições Encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");

        }

    }
}
