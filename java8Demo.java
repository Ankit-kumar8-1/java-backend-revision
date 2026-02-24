import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java8Demo {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        list.stream()
                .filter((i) -> {
                    System.out.println("Heelo " + i);
                    return i > 4;
                }).forEach(System.out::println);

        list.stream()
                .filter(x -> x > 3)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("Parallel Steam ");

        list.parallelStream().forEach(System.out::println);

        System.out.println(" Map section ");
        list.stream()
                .map(x -> x / 3)
                .forEach(System.out::println);

        System.out.println("Map section Using String ");
        List<String> list2 = Arrays.asList("Ankit", "Rohit", "Shilpa");
        list2.stream()
                .map(String::toCharArray)
                .forEach(System.out::println);
    }
}
