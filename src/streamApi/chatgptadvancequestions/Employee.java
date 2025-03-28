package streamApi.chatgptadvancequestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Sanjay", "HR", 250000.00),
                new Employee("Saurav", "Technical", 45000.00),
                new Employee("Ananya", "HR", 600.00),
                new Employee("Ravi", "Technical", 70000.00),
                new Employee("Neha", "Finance", 90000.00),
                new Employee("Amit", "Finance", 120000.00),
                new Employee("Priya", "Technical", 80000.00),
                new Employee("Vikas", "HR", 75000.00)
        ));

        List<String> ans = employees
                .stream()
                .distinct()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName).toList();

        ans.forEach(System.out::println);

        Employee ans2 = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()).skip(1)
                .findFirst().orElse(null);

        Map<String, Double> avgSalary = employees.stream().
                collect(Collectors
                        .groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println(avgSalary);


        Map<Object, List<String>> ans3 = employees.stream().collect(Collectors.groupingBy(employee ->
                employee.getSalary() <= 50000 ? "less than 50k" : "more than 50K"
                , Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(ans3);
    }
}