package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;
import org.w3c.dom.ls.LSOutput;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {


        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
