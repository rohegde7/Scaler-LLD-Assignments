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

}
