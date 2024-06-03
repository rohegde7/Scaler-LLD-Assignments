package threads.semaphores;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class ZeroEvenOdd {

    private int n;
    Semaphore zeroSemaphore = new Semaphore(1);
    Semaphore evenSemaphore = new Semaphore(0);
    Semaphore oddSemaphore = new Semaphore(0);
    private int count = 1;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        while (count < n) {
            zeroSemaphore.acquire();
            printNumber.accept(0);

            if (count % 2 == 0) {
                evenSemaphore.release();
            } else {
                oddSemaphore.release();
            }
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        while (count < n) {
            evenSemaphore.acquire();
            printNumber.accept(count);
            count++;
            zeroSemaphore.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        while (count < n) {
            oddSemaphore.acquire();
            printNumber.accept(count);
            count++;
            zeroSemaphore.release();
        }
    }
}
