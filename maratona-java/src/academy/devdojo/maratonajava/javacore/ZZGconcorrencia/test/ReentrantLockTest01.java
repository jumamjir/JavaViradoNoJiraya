package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable{
private String name;
private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if(lock.isHeldByCurrentThread()) {

            }
        }finally {
            lock.unlock();
        }
    }
}
public class ReentrantLockTest01 {
    public static void main(String[] args) {

    }
}
