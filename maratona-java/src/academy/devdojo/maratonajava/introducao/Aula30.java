package academy.devdojo.maratonajava.introducao;

public class Aula30 {
    public static void main(String[] args) {
        int valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal ; parcela++) {
            int valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

    }

}
