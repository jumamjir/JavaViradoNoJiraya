package academy.devdojo.maratonajava.javacore.Gassociacao.test;
import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo:");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade abaixo:");
        int idade = teclado.nextInt();
        System.out.println("Digite M ou F para seu sexo:");
        char sexo = teclado.next().charAt(0);
        System.out.println("-------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }
}
