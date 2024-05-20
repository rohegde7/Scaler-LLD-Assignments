package threads;

public class DaemonThread {
    public static void main(String[] args) {
        T t = new T();
        Thread tr = new Thread(t);
        tr.setDaemon(true);
        tr.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }
}

class T implements Runnable {
    @Override
    public void run() {

        int counter = 1;
        while(true) {
            System.out.println("Hello" + counter);
            counter++;
        }
    }
}
