package threads;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();


        Adder a = new Adder(x, y);

        Thread t = new Thread(a);
        t.start();
    }
}


