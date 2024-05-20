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
