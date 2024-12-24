package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

class RandomNumberCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callbable...%n", Thread.currentThread().getName());
        }
        return String.format("%s finished adn the random number is %d", Thread.currentThread().getName(), count);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumberCallable);
        String s = future.get();
        System.out.printf("Program finished%s",s);
        executorService.shutdown();
    }
}
