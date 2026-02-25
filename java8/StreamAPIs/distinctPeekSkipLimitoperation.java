package java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class distinctPeekSkipLimitoperation {

    public static void main(String[] args) {
        List<Integer> numIntegers = List.of(1, 2, 3, 4, 6, 3, 3, 3, 3, 2, 2, 2, 1, 7, 8, 6, 7, 8, 9, 6, 5, 4, 5, 6, 7);
        numIntegers.stream().distinct().limit(10).sorted().forEach(System.out::println);

        numIntegers.stream().limit(5).forEach(System.out::println);

        numIntegers.stream().skip(4).forEach(System.out::println);

        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .peek(n -> System.out.println("Before filter: " + n))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println("After filter : " + n))
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
