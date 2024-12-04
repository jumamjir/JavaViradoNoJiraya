package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.Service.AnimeComparators;
import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators :: compareByEpisodesNonStatic);
        System.out.println(animeList);
    }

}
