package threads.semaphores;


import java.util.concurrent.Semaphore;

// Problem: https://www.scaler.com/academy/mentee-dashboard/class/202736/homework/problems/58820?navref=cl_tt_lst_sl
public class H2O {

    public H2O() {

    }

    Semaphore hydrogen1 = new Semaphore(1);
    Semaphore hydrogen2 = new Semaphore(0);
    Semaphore oxygen = new Semaphore(0);

    boolean isHydrogen1Acqired = false;

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

//        hydrogen1.acquire();
//        hydrogen2.acquire();
//        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
//        releaseHydrogen.run();
//        hydrogen2.release();
//        oxygen.release();

        synchronized (this) {
            if(isHydrogen1Acqired) {
                isHydrogen1Acqired  = false;
                hydrogen2.acquire();
                releaseHydrogen.run();
                oxygen.release();

            } else {
                isHydrogen1Acqired = true;
                hydrogen1.acquire();
                releaseHydrogen.run();
                hydrogen2.release(6);
            }
        }

    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        oxygen.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        hydrogen1.release();
    }
}
