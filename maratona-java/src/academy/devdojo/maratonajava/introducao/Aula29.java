package academy.devdojo.maratonajava.introducao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aula29 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}