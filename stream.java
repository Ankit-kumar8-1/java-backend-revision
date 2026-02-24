import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
        // number.stream()
        int count = 0;
        for (int i : number) {
            if (i % 2 == 0) {
                count++;
            }
        }

        // Create Stream
        // 1 from collections
        System.out.println(number.stream()
                .filter(x -> x % 2 == 0)
                .count());

        String[] arr = { "a,", "b", "c" };
        Stream<String> stream = Arrays.stream(arr);

        Stream<String> stream2 = Stream.of("a", "b", "c");

        // "Infinte Stream "
        Stream<Integer> gStream = Stream.generate(() -> 1).limit(100);

        Stream.iterate(0, x -> x + 1).limit(50);

    }
}
