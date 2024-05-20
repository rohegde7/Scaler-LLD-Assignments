package Interfaces;

import java.util.PriorityQueue;

interface MyI {
    void kyaHaal();
}

interface Inter {
    void dis();

//    void dis2() {
//
//    }
}

abstract class Abs {

    PriorityQueue<Integer> pi = new PriorityQueue<>();
    int a = 10;
    int b;

//    abstract int c;

   abstract void disAbs() ;
}

class X {

    public static void main(String[] args) {
//        new Abs();
//        System.out.println(Inter.x);

        MyI mi = new MyI(){
            @Override
            public void kyaHaal() {

            }
        };
    }
}