
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Ankit", "Rohit", "PANKAJ");

        Runnable r = () -> System.out.println("Hello Ji I am Runnable interface ");
        r.run();

        Consumer<String> great = name -> System.out.println("Hello " + name);
        great.accept("Ankit");
        great.accept("Rohit");

        Consumer<Integer> squaConsumer = (x) -> System.out.println(x * x);
        squaConsumer.accept(5);

        Consumer<String> greatConsumer = (name) -> {
            System.out.println("-------------");
            System.out.println("name : " + name);
            System.out.println("0--------------");
        };

        greatConsumer.accept("Rohit");

        BiFunction<Integer, Integer, Integer> function = (a, b) -> {
            return a + b;
        };

        System.out.println(function.apply(3, 8));

        BiFunction<String, String, String> sol = (a, b) -> a + " is  good" + b;
        System.out.println(sol.apply("Ankit", "Boy"));

    }

}
