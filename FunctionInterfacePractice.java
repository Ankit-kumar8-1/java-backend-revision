import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfacePractice {
    public static void main(String[] args) {

        Greeting sum = (a, b) -> a + b;
        System.out.println("Sum : " + sum.cal(3, 4));

        Greeting mul = (a, b) -> a * b;
        System.out.println("Multiple : " + mul.cal(8, 9));
        mul.second();

        Predicate<Integer> resulPredicate = (x) -> x > 9;
        System.out.println(resulPredicate.test(7));

        Function<Integer, Integer> resFunction = (x) -> x + 2;
        // int d = resFunction.apply(9);
        System.out.println(resFunction.apply(9));

        Function<String, Integer> getLength = (s) -> {
            if (s.length() <= 0) {
                return 0;
            } else {
                return s.length();
            }
        };
        int s = getLength.apply("Rohit singh ");
        System.out.println(s);

        Consumer<String> consumer = (name) -> System.out.println("Hello " + name);
        consumer.accept("Rohit");

        Supplier<Double> supplier = () -> 45.4 + 4;
        System.out.println(supplier.get());

    }

}
