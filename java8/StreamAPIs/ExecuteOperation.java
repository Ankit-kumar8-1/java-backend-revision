package java8.StreamAPIs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExecuteOperation {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 75000),
                new Employee("Priya", "HR", 45000),
                new Employee("Amit", "IT", 90000),
                new Employee("Sneha", "HR", 62000),
                new Employee("Ravi", "Finance", 48000),
                new Employee("Neha", "IT", 55000));

        // 1. Count IT employees
        long itCount = employees.stream()
                .filter(e -> e.dept.equals("IT"))
                .count();
        System.out.println("IT Count: " + itCount); // 3

        // 2. Total salary of all employees
        int totalSal = employees.stream()
                .mapToInt(e -> e.salary).sum();
        System.out.println("Total Salary: " + totalSal); // 375000

        // 3. Highest paid employee name
        String topEmp = employees.stream()
                .max(Comparator.comparingInt(e -> e.salary))
                .get().name;
        System.out.println("Top Earner: " + topEmp); // Amit

        // 4. Any employee earning > 80000?
        boolean anyRich = employees.stream()
                .anyMatch(e -> e.salary > 80000);
        System.out.println("Anyone > 80k: " + anyRich); // true

        // 5. All employees earning > 30000?
        boolean allDecent = employees.stream()
                .allMatch(e -> e.salary > 30000);
        System.out.println("All > 30k: " + allDecent); // true

        // 6. Names joined as String
        String nameList = employees.stream()
                .map(e -> e.name)
                .collect(Collectors.joining(", "));
        System.out.println(nameList);
        // Rahul, Priya, Amit, Sneha, Ravi, Neha

        // 7. Group by Department
        Map<String, List<Employee>> byDept = employees.stream()
                .collect(Collectors.groupingBy(e -> e.dept));
        byDept.forEach((dept, list) -> {
            System.out.print(dept + " → ");
            list.forEach(e -> System.out.print(e.name + " "));
            System.out.println();
        });
        // IT → Rahul Amit Neha
        // HR → Priya Sneha
        // Finance → Ravi

        // 8. Average salary per department
        Map<String, Double> avgByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.dept,
                        Collectors.averagingInt(e -> e.salary)));
        System.out.println(avgByDept);
    }
}
