package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HundredThreads {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);

        int j = 0;

        for(int i =0; i< 1000000; i++) {
            es.submit(new Callable<Void>() {
                @Override
                public Void call() throws Exception {
                    System.out.println("Thread welcome" + Thread.currentThread().getName());
                    return null;
                }
            });
        }

        es.close();
    }
}
