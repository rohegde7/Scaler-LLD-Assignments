package threads;

public class Demo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());

        Thread t = new Thread();
        t.setPriority(4);
        System.out.println(t.getPriority());
        System.out.println(new ThreadGroup("Helllo").getMaxPriority());
    }
}

 class JoinExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread t1 is running");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread t1 has finished");
        });

        t1.start();

        try {
            t1.join();  // Waits for t1 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread continues after t1 has finished");
    }
}
