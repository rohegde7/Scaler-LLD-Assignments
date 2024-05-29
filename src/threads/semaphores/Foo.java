package threads.semaphores;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore first = new Semaphore(1);
    Semaphore second = new Semaphore(0);
    Semaphore third = new Semaphore(0);

    public Foo() {

    }


    public Foo(Semaphore first, Semaphore second, Semaphore third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        first.acquire();

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();

        second.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        second.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        third.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        third.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        first.release();
    }
}