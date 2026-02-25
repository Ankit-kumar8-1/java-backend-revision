package java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.lang.model.type.NullType;

public class IntermediateOperiton {
    public static void main(String[] args) {

        // filter -- > channi

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream().filter(x -> x % 2 == 0 || x % 3 == 0) // number ko 2 or 3 se jo divisable hai un ko le rahe
                .forEach(System.out::println);

        // Filter by greater value
        list.stream()
                .filter(x -> x > 7).forEach(System.out::println);

        // filter string by length
        List<String> names = List.of("Rohit", "Amit", "Nitin", "Neeraj", "Aditya", "sumit", "Dinesh");
        long count = names.stream().filter(n -> n.length() > 5).count(); // jis string ke length 6 se greater hai un ko
                                                                         // count kar rahe hai
        System.out.println("Total String greater than 5 : " + count);

        // Multiple filter() Chaining
        List<Integer> numbIntegers = List.of(1, 34, 2, 43, 55, 67, 4, 3, 22, 67, 433, 23, 990, 56, 78, 54, 33, 4, 5, 6,
                7,
                8);
        List<Integer> fIntegers = numbIntegers.stream()
                .filter(x -> x % 2 == 0)
                .filter(x -> x > 100)
                .collect(Collectors.toList());

        System.out.println(fIntegers);

        // filter() with Object (Real World)

        List<Employee> employees = Arrays.asList(new Employee("Rohit", "It", 20000),
                new Employee("amit", "It", 40000), new Employee("Shilpa", "It", 50000),
                new Employee("rohan", "CS", 90000));

        employees.stream().filter(e -> e.dept.equals("It"))
                .filter(s -> s.salary > 35000)
                .map(e -> e.name)
                .forEach(System.out::println);

        // Filter with the null check
        List<String> nameStrings = Arrays.asList("Ankit", null, "Rohit", null, "Shilpa", "Amit", null);
        List<String> res = nameStrings.stream()
                .filter(n -> n == null)
                .collect(Collectors.toList());

        System.out.println(res);

        // optimize version
        List<String> nameList = nameStrings.stream().filter(Objects::nonNull).toList();
        System.out.println(nameList);

    }

}

class Employee {
    String name;
    String dept;
    int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

}
