package java8.StreamAPIs;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOpeation {

    public static void main(String[] args) {
        List<Integer> numList = List.of(8, 9, 7, 8, 6, 1, 2, 1, 4, 5, 7, 9, 0);
        List<Integer> sortedList = numList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> strings = List.of("Rohit", "Amit", "shilpa", "rohan", "prince");
        List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);

        List<String> descendStrings = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendStrings);

        List<Integer> descendingList = numList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingList);

        List<String> word = List.of("sorted", "ascending", "consider", "hello", "as", "chandresh");
        List<String> sortBasedOnLength = word.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(sortBasedOnLength);

        sortBasedOnLength = word.stream().sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(sortBasedOnLength);

        // Real world uses;

        List<Employee> sortBasedOnSalary = List.of(
                new Employee("Rohit", "frontend", 50000),
                new Employee("Amit", "testing", 60000),
                new Employee("Ankit", "Backend Develper", 120000));

        List<Employee> sortedEmployees = sortBasedOnSalary.stream()
                .sorted(Comparator.comparing((Employee e) -> e.dept).thenComparingInt(e -> e.salary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

    }

}
