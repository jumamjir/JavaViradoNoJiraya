package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jaozin");
        funcionario.setIdade(12);
        funcionario.setSalario( new float[]{1200.0f,1300.0f,1500.0f});

        float mediaSalarios = funcionario.mediaSalario();

        funcionario.imprime();
        System.out.printf("A média dos salários é igual a: $%.2f", mediaSalarios);

    }
}
