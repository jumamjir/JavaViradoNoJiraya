package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

class ThreadExample extends Thread {
    private final char c;

    // Construtor para inicializar o caractere que será impresso pela thread
    public ThreadExample(char c) {
        this.c = c;
    }

    // Método que define a ação da thread
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); // Imprime o nome da thread atual
        for (int i = 0; i < 500; i++) {
            System.out.print(c); // Imprime o caractere
            if (i % 100 == 0) {
                System.out.println(); // Pula para uma nova linha a cada 100 caracteres
            }
        }
    }
}

class ThreadExampleRunnable implements Runnable {
    private final char c;

    // Construtor para inicializar o caractere que será impresso pela thread
    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    // Método que define a ação da thread
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()); // Imprime o nome da thread atual
        for (int i = 0; i < 500; i++) {
            System.out.print(c); // Imprime o caractere
            if (i % 100 == 0) {
                System.out.println(); // Pula para uma nova linha a cada 100 caracteres
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

// Demonstração da criação e execução de threads, utilizando tanto a classe Thread quanto a interface Runnable
public class ThreadTest01 {
    public static void main(String[] args) {
        // Criação de threads utilizando a interface Runnable
        Thread t1 = new Thread (new ThreadExampleRunnable('A'),"T1A");
        Thread t2 = new Thread (new ThreadExampleRunnable('B'),"T2B");
        Thread t3 = new Thread (new ThreadExampleRunnable('C'),"T3C");
        Thread t4 = new Thread (new ThreadExampleRunnable('D'),"T4D");

        // Inicia a execução das threads
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        System.out.println("######################################## " + Thread.currentThread().getName()); // Imprime uma mensagem da thread principal
    }
}