package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() throws IOException {
        File file = new File("maratona-java/arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo Criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

