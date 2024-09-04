package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor p1 = new Professor();

        p1.idade = 140;
        p1.nome = "Mestre Kami";
        p1.sexo = 'M';
        System.out.println("Nome:" + p1.nome + " Idade:"
                + p1.idade + " Sexo:"
                +p1.sexo);
    }
}
