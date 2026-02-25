import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class findEven {

        public static void main(String[] args) {
                List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
                List<Integer> sol = input.stream()
                                .filter(x -> x % 2 == 0)
                                .collect(Collectors.toList());

                System.out.println(sol);

                List<String> names = List.of("rohit", "amit", "aditya", "neeraj", "nitin");
                names.stream()
                                .map(x -> x.toUpperCase())
                                .collect(Collectors.toList())
                                .forEach(x -> System.out.println(x));

                List<String> fruits = List.of("Apple", "Bananna", "litchi", "Mango");
                Long count = fruits.stream()
                                .filter(x -> x.startsWith("A"))
                                .count();

                System.out.println("Total Word start with A : " + count);

                System.out.println("Remove dupicate and arranged in sorted order");

                List<Integer> numList = List.of(9, 8, 7, 3, 9, 6, 4, 2, 4, 5, 6);
                numList.stream()
                                .distinct()
                                .sorted()
                                .collect(Collectors.toList())
                                .forEach(System.out::print);

                System.out.println("Count total salary ");

                List<Employee> employees = Arrays.asList(
                                new Employee("rohit", 70000),
                                new Employee("Shilpa", 90000),
                                new Employee("Aditya", 100000));

                Employee graterSalaryEmployee = employees.stream()
                                .max(Comparator.comparingInt(e -> e.salary))
                                .get();

                System.out.println(
                                "name : " + graterSalaryEmployee.name + " , Salary : " + graterSalaryEmployee.salary);

                List<Student> students = Arrays.asList(
                                new Student("Rohit", "Science"),
                                new Student("Amit", "Commerce"),
                                new Student("Neeraj", "Science"),
                                new Student("shilpa", "Commerce"));

                Map<String, List<Student>> grouped = students.stream()
                                .collect(Collectors.groupingBy(s -> s.depth));

                grouped.forEach((dept, stuList) -> {
                        System.out.print(dept + "-> ");
                        stuList.forEach(s -> System.out.print(s.name + " "));
                        System.out.println();
                });

        }
}

class Employee {
        String name;
        Integer salary;

        public Employee(String name, Integer salary) {
                this.name = name;
                this.salary = salary;
        }

}

class Student {
        String name;
        String depth;

        public Student(String name, String depth) {
                this.name = name;
                this.depth = depth;
        }

}