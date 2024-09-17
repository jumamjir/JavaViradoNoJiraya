package academy.devdojo.maratonajava.javacore.Gassociacao.test;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador1, jogador2};

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador1.imprime();

        System.out.println("--- Time ---");

        time.imprime();

    }
}
