package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // Bold String or Constant String Pool
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William");// 1 Variável de referência,2-Objeto do tipo String,3- uma String no pool de Strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
