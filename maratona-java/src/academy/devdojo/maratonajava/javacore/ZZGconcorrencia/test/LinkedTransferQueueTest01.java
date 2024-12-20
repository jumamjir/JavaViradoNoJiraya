package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("JoaoPedro"));
        System.out.println(tq.offer("JoaoPedro"));
        System.out.println(tq.remainingCapacity());
    }
}
