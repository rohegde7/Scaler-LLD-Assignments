package threads;

import com.sun.source.tree.TryTree;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(10);

        Scanner s = new Scanner(System.in);
        int x = s.nextInt();


        Future<ArrayList<Integer>> fal = es.submit(new ArrayCreator(x));

        try {
            ArrayList<Integer> ai = fal.get();

            System.out.println(ai);
        } catch (Exception e) {

        }


    }
}

class ArrayCreator implements Callable<ArrayList<Integer>> {

    int n;

    public ArrayCreator(int n) {
        this.n = n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> ai = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ai.add(i);
        }

        return ai;
    }
}


