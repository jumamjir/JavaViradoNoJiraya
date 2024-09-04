package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        c1.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        c1.subtraiDoisNumeros();
    }
}
