package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123, 133, 1@3, 1A3




        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z)])+(\\.([a-zA-Z)])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@mail.br, teste@gmail.com, sakura@mail ";
        System.out.print("Email Válido: ");
        System.out.println("#@!zoro@mail.br".matches(regex));
        System.out.println((texto.split(",")[1].trim()));

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
