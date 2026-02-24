import java.util.Arrays;
import java.util.List;

public class main2 {
    public static void main(String[] args) {

        List<String> list = List.of("Hello", "World");

        list.stream()
                .flatMap(x -> Arrays.stream(x.split("l")))
                .forEach(System.out::println);

        List<List<Integer>> list2 = List.of(
                List.of(1, 2, 3),
                List.of(1, 2, 3));

        list.stream()
                .flatMap(x -> Arrays.stream(x.split("")))
                .forEach(System.out::print);
    }
}
