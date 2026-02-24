import java.util.Arrays;
import java.util.List;

public class Intermediate {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Rohit", "Aman", "Shilpa");
        name.stream()
                .filter(x -> x.startsWith("A"))
                .count();

        name.stream().map(x -> x.toLowerCase());
        name.stream().sorted();
        name.stream().sorted((a, b) -> a.length() - b.length());

        Runnable r = () -> System.out.println("Hello i am also runnable");
        r.run();

    }
}
