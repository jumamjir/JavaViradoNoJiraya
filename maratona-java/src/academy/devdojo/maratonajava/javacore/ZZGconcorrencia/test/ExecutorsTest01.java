package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Printer implements Runnable {
    private final int num;

    public Printer(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.printf("%s inicio: %d%n", Thread.currentThread().getName(), num);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("%s finalizou%n", Thread.currentThread().getName());
    }
}

public class ExecutorsTest01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

//        Executors.newFixedThreadPool(1).execute(new Printer(1));

    }
}
