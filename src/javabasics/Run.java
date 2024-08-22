package javabasics;

import time.Time;

public class Run {

    public static void main(String[] args) {
        Thread t = new Thread(new RunnableImpl());
        Thread t2 = new Thread();

        System.out.println(Time.getCurrentTime());

        System.out.println(t.getState());

        try {
            t.wait(1000000);
            t.start();
        } catch (Exception e) {

        }


        System.out.println(Time.getCurrentTime());

        System.out.println(t.getState());

        System.out.println(t.getState());
        System.out.println(Time.getCurrentTime());



    }
}

class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println("Implemented runnable inter");
        System.out.println(Time.getCurrentTime());
    }
}
