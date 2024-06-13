package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateFunc {
}

class CollectMethodQuestion1 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        String result = fruits.stream()
                .collect(Collectors.joining(", "));

        System.out.println("Result: " + result);
    }

    static List<Integer> getOdd(Stream<Integer> stream){
        // write code here

        List<Integer> oddNumbers = stream.filter(i -> i%2 != 0).collect(Collectors.toList());
        return oddNumbers;
    }

    static int getSum(Stream<Integer> stream){
        // write code here
        int sum = stream.reduce((item1, item2) -> item1 + item2).get();
        return sum;
    }

}

class GFG {

    // Driver code
    public static void main(String[] args)
    {

        // Creating list of integers
        List<Integer> array = Arrays.asList(5,10);

        // Finding sum of all elements
        int sum = array.stream().reduce(1,
                Integer::sum);

        // Displaying sum of all elements
        System.out.println("The sum of all elements is " + sum);
    }
}
