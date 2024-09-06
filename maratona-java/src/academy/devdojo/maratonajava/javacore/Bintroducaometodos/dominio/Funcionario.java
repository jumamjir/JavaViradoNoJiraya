package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public float[] salario;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Arrays.toString(salario));
    }
    public float mediaSalario() {
        return (salario[0] + salario[1] + salario[2]) / 3;
    }
}