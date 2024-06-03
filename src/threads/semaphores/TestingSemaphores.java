package threads.semaphores;

import java.util.concurrent.Semaphore;

public class TestingSemaphores {

    static Semaphore one = new Semaphore(1);
    static Semaphore two = new Semaphore(0);

    public static void main(String[] args) {
        two.release();
        two.release();
    }
}
