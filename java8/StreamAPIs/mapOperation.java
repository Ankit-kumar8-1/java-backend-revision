package java8.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mapOperation {

        public static void main(String[] args) {
                System.out.println("Program is running .......");

                // String to uppercasr
                List<String> names = List.of("Ankit", "Rohan", "Sahil", "monika", "sunita", "anita", "sabita");
                names.stream()
                                .map(String::toUpperCase)
                                .forEach(System.out::println);

                // String to Integer

                List<String> num = List.of("1", "2", "3", "4", "5", "6");
                num.stream()
                                .map(s -> Double.parseDouble(s)) // convert to integer, double long , any more
                                .forEach(System.out::println);

                num.stream()
                                .map(Integer::parseInt)
                                .forEach(System.out::println); // Optimze version

                // get length to each string
                List<Integer> lengthOfName = names.stream()
                                .map(x -> x.length())
                                .collect(Collectors.toList());

                System.out.println(lengthOfName);

                // /map() with Object
                List<Employee> employees = Arrays.asList(new Employee("Rohit", "CS", 90000),
                                new Employee("ajay", "CS", 80000), new Employee("chandresh", "ECE", 70000),
                                new Employee("Harshit", "It", 20000));

                // use filter with map get all CS depatment student
                List<String> employeesName = employees.stream()
                                .filter(e -> e.dept.equals("CS"))
                                .map(e -> e.name)
                                .collect(Collectors.toList());

                System.out.println(employeesName);

                // map() to Transform Objec (10% hike)
                List<Employee> hikedEmployees = employees.stream()
                                .map(e -> new Employee(e.name, e.dept, (int) (e.salary * 1.10)))
                                .collect(Collectors.toList());

                hikedEmployees.forEach(e -> System.out.println("name : " + e.name + " , Salary : " + e.salary));

                // map , maptoint, maptodouble, maptolong
                IntStream nuIntStream = names.stream()
                                .mapToInt(String::length);
                System.out.println(nuIntStream);

                int totalLength = names.stream()
                                .mapToInt(String::length)
                                .sum();

                System.out.println(totalLength);

                List<Integer> numIntegers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
                Double ingerteToDoubles = numIntegers.stream().mapToDouble(x -> x * 1.0).sum();
                System.out.println("Sum : " + ingerteToDoubles);

        }

}
