package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "João Pedro";

    static class Nested {
        private String lastName = "Madeira";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }
}
