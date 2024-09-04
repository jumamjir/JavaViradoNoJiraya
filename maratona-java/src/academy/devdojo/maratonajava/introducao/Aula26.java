package academy.devdojo.maratonajava.introducao;
public class Aula26 {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
