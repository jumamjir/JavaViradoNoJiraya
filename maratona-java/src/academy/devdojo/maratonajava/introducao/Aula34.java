package academy.devdojo.maratonajava.introducao;

public class Aula34 {
    public static void main(String[] args) {
        // byte,short,int,long,float,double = 0;
        //char '\u0000' ' '
        //boolean false
        //String null

        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
