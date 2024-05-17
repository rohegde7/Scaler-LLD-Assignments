package Interfaces;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Practice {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length(); // Order by descending length
            }
        });

        pq.add("Rohit");
        pq.add("Rohit2");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
 class Car {

    int Price;
    int Speed;

}
interface CarsPrice {

    PriorityQueue<Car> cars = new PriorityQueue<>(new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o2.Price - o1.Price;
        }
    });
}
