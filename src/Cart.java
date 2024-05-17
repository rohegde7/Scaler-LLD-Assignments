import org.jetbrains.annotations.NotNull;

public class Cart implements Comparable {

    int Price;
    int Speed;

    void compareTo() {

//        PriorityQueue<Car> cars = new PriorityQueue<>(new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.Price - o1.Price;
//            }
//        });

    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}

