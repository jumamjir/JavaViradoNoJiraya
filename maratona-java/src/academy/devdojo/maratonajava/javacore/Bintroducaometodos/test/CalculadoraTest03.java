package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        double resultado = c1.divideDoisNumeros(20,0);
        System.out.println(resultado);
        System.out.println(c1.divideDoisNumeros02(20,0));
        System.out.println("---------------------");

        c1.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
