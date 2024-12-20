package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("JoaoPedro"));
        System.out.println(tq.offer("JoaoPedro"));
        System.out.println(tq.offer("JoaoPedro", 10, TimeUnit.SECONDS));
        tq.put("DevDojo");
        if(tq.hasWaitingConsumer()) {
            tq.transfer("DevDojo");
        }
        tq.transfer("DevDojo");
        System.out.println(tq.remainingCapacity());
    }
}
