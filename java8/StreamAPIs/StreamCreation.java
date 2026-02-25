package java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {
        System.out.println("Hello Ankit Hello HAL HAI");

        // 1
        List<String> names = List.of("Ankit", "Rohit", "Shipla", "Nitin");
        Stream<String> stream = names.stream();

        // 2
        String[] fruits = { "Apple", "Bananna", "litchi", "graps", "watermelon" };
        Stream<String> stream2 = Arrays.stream(fruits);

        // 3
        Stream<Integer> num = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> res = num.filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(res);

        // 4
        Stream<Integer> evens = Stream.iterate(0, x -> x + 2);
        evens.limit(5).forEach(System.out::println);

        // 5
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);

        // 6
        IntStream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(x -> x > 4)
                .forEach(System.out::println);
    }
}
