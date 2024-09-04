package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();

        e1.nome = "Luffy";
        e1.idade = 21;
        e1.sexo = 'M';
        System.out.println(e1.nome);
        System.out.println(e1.idade);
        System.out.println(e1.sexo);
    }
}
