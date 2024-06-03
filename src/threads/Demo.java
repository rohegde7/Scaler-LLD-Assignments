package threads;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        final ReadWriteLock lock = new ReentrantReadWriteLock();

        lock.writeLock();

        synchronized (new Object()) {
            System.out.println("");
        }


        Thread t = new Thread();
        t.setPriority(4);
        System.out.println(t.getPriority());
        System.out.println(new ThreadGroup("Helllo").getMaxPriority());
    }
}

 class JoinExample {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            ThreadLocal.withInitial(() -> "Hello");

            System.out.println("Thread t1 is running");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Thread t1 has finished");
        });

        t1.start();

        try {
            t1.interrupt();  // Waits for t1 to finish
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues after t1 has finished");
        System.out.println(Thread.currentThread().isInterrupted());
    }
}
