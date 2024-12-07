package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
        private static List<LightNovel> lightNovels = new ArrayList<>(
                List.of(
                        new LightNovel("Tensei Shittara", 8.99),
                        new LightNovel("OverLord", 10.99),
                        new LightNovel("Violet Evergarden", 5.99),
                        new LightNovel("No Game no life ", 2.99),
                        new LightNovel("Fullmetal Alchemist ", 5.99),
                        new LightNovel("Kumo desuga ", 1.99),
                        new LightNovel("Kumo desuga ", 1.99),
                        new LightNovel("Monogatari ", 4.00)
                ));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
    }
}