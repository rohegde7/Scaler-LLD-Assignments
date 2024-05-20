package threads;

import java.util.concurrent.*;

public class ExecutosSomething {

    public static void main(String[] args) {

        ExecutorService e = Executors.newFixedThreadPool(1000);

//        new Executor().execute();
        
        Future<Void> f = e.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {

                for (int i =0; i< 10000; i++) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Hello 1: YESSS" + i);
                }
                return null;
            }
        });

//        f.get();

        e.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {

                for (int i =0; i< 10000; i++) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Hello 2 NOW:" + i);
                }
                return null;
            }
        });

        e.submit(new Callable<Void>() {
            @Override
            public Void call() throws Exception {

                for (int i =0; i< 10000; i++) {
                    System.out.println(Thread.currentThread().getName());
                    System.out.println("Hello 3: KYAAA" + i);
                }
                return null;
            }
        });
    }
}

class ImpleCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return null;
    }
}

class BinaryTreeHeight {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root = new Node(10, new Node(20, null, null), null);

        ExecutorService es = Executors.newFixedThreadPool(10);

        Future<Integer> heightFuture = es.submit(new TreeSizeCalculator(root, es));
        System.out.println(heightFuture.get());
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService es;

    int height = 0;

    public TreeSizeCalculator(Node root, ExecutorService es) {
        this.root = root;
        this.es = es;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null) {
            return height;
        }

        height++;

        Future<Integer> leftTreeHeightFuture = es.submit(new TreeSizeCalculator(root.left, es));
        Future<Integer> rightTreeHeightFuture = es.submit(new TreeSizeCalculator(root.right, es));

        height += leftTreeHeightFuture.get();
        height += rightTreeHeightFuture.get();

        return height;
    }
}
