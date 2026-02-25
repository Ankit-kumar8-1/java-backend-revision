package java8.StreamAPIs;

import java.util.List;

public class IntermediateOperiton {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(x -> x % 2 == 0 || x % 3 == 0)
                .forEach(System.out::println);
    }
}
