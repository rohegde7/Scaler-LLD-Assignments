package streams;

import java.util.Collection;
import java.util.Collections;

public class LambdaIntro {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable r2 = () -> System.out.println("Kya haal bawa");

        Runnable r3 = () -> {
            System.out.println("Sahi hai bawaaaa");
        };

//        Collections.sort();

//        List<Integer> i
    }

}

interface RunTheMarathon {
    void printName(String name);
}
