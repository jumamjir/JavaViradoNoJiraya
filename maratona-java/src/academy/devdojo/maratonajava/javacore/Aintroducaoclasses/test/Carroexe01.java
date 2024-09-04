package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class Carroexe01 {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.ano = 2012;
        c1.nome = "Hondão";
        c1.modelo = "Civiczada";

        c2.ano = 1995;
        c2.nome = "Toyotão";
        c2.modelo = "Suprozo";



        System.out.println("Carro do modelo:"+ c1.modelo + ", Nome:"
                + c1.nome + ", Do ano de:" + c1.ano);

        System.out.println("Carro do modelo:"+ c2.modelo + ", Nome:"
                + c2.nome + ", Do ano de:" + c2.ano);
    }
}
