package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    private String nome;
    private int idade;
    private float[] salario;
    private double media;


    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(Arrays.toString(salario));
    }
    public float mediaSalario() {
        return (salario[0] + salario[1] + salario[2]) / 3;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float[] getSalario() {
        return salario;
    }

    public void setSalario(float[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}