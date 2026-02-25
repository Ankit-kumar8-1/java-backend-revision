package java8.StreamAPIs;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapOperations {
    public static void main(String[] args) {

        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7, 8, 9));

        List<Integer> soList = list.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
        System.out.println(soList);
        // method reference
        List<Integer> sol = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(sol);

        // split sentence to word
        List<String> strings = Arrays.asList("Hello Java is", "Good Language", "for beginners");
        List<String> stringConvertToArrays = strings.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        System.out.println(stringConvertToArrays);

        // All Unique Characters from Words
        List<String> convertToCharacters = strings.stream().flatMap(sentence -> Arrays.stream(sentence.split("")))
                .collect(Collectors.toList());
        System.out.println(convertToCharacters);

        // get all marks of alll student

        List<Student> students = List.of(new Student("Amit", List.of("98", "56", "78")),
                new Student("Rohit", List.of("67", "89", "67")), new Student("kirti", List.of("90", "87", "89")));

        List<String> allMarkList = students.stream()
                .flatMap(s -> s.marks.stream())
                .collect(Collectors.toList());

        System.out.println(allMarkList);

        List<Integer> maxMarkList = students.stream()
                .flatMap(x -> x.marks.stream())
                .map(Integer::parseInt)
                .filter(p -> p > 50)
                .filter(p -> p % 2 == 0)
                .distinct().collect(Collectors.toList());

        System.out.println(maxMarkList);
    }

}

class Student {
    String name;
    List<String> marks;

    public Student(String name, List<String> marks) {
        this.name = name;
        this.marks = marks;
    }

}