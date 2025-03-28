package streamApi.chatgptTest;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age, double salary, String department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    private double salary;
    private String department;


}

class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Alice", 28, 60000, "HR"));
        employees.add(new Employee("Bob", 35, 75000, "IT"));
        employees.add(new Employee("Charlie", 25, 48000, "Finance"));
        employees.add(new Employee("David", 40, 52000, "IT"));
        employees.add(new Employee("Eve", 50, 450000, "Enginnering"));
        employees.add(new Employee("Frank", 44, 800000, "Sinance"));
        employees.add(new Employee("Grace", 27, 65000, "IT"));
        employees.add(new Employee("Hank", 33, 70000, "HR"));
        employees.add(new Employee("Ivy", 29, 51000, "Finance"));
        employees.add(new Employee("Jack", 31, 56000, "IT"));

        Map<String, List<Employee>> ans = employees
                .stream()
                .filter(employee -> !(employee.getSalary() > 50000)).sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()));

        Map<String, Double> depAvgSalary = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println("{");
//        depAvgSalary.forEach((key, value) -> {
//            System.out.println("Department: " + key + ", Average Salary:" + value);
//        });
//        System.out.println("}");

        Map<String, Optional<Employee>> ans2 = employees.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparingInt(Employee::getAge))));

        Employee secondHighestSalaryData = employees
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

//        System.out.println(secondHighestSalaryData.getName());

        Map<String, Double> sumOfSalary =  employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));

//        sumOfSalary.forEach((key, value) -> {
//            System.out.println(key + ":" + value);
//        });

//        Map<String, Optional<Employee>> lowestSalary = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors
//                        .minBy(Comparator.comparingDouble(Employee::getSalary))));
//        System.out.println(lowestSalary);

        Double avgSalary = employees.stream().filter(employee -> employee.getAge() > 30).collect(Collectors.averagingDouble(Employee::getSalary));
//        System.out.println(avgSalary);

//        String highestSalary = employees.stream()
//                .collect(Collectors
//                        .groupingBy(Employee::getDepartment, Collectors
//                                .summingDouble(Employee::getSalary)))
//                .entrySet().stream().max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElse(null);

        Map<String, String> youngestPerson = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.collectingAndThen(
                Collectors.minBy(Comparator.comparingInt(Employee::getAge)),
                emp -> emp.map(Employee::getName).orElse(null)
        )));

        String thirdHighestSalary = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2).findFirst().map(Employee::getName).orElse(null);
//        System.out.println(thirdHighestSalary);


        Double sum = employees
                .stream()
                .filter(emp -> emp.getName().toLowerCase().charAt(0) == 'a')
                .mapToDouble(Employee::getSalary).sum();

//        System.out.println(sum);

        Map<String, Double> avgAge = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingInt(Employee::getAge)
                )).entrySet().stream().filter(emp -> emp.getValue() > 35)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

//        System.out.println(avgAge);

//        Find the department with the highest average salary among those where the average age is less than 40.
        Map<String, Double> ans5 = employees.stream().collect(Collectors
                .groupingBy(Employee::getDepartment, Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> list.stream().collect(Collectors.teeing(
                                Collectors.averagingInt(Employee::getAge),
                                Collectors.averagingDouble(Employee::getSalary),
                                (age, salary) -> Map.of("age", age, "salary", salary)
                        ))
                ))).entrySet()
                .stream()
                .filter(entry -> entry.getValue().get("age") < 40)
                .max(Comparator.comparingDouble(entry -> entry.getValue().get("salary")))
                .map(entry -> Map.of(entry.getKey(), entry.getValue().get("salary")))
                .orElse(null);
//        System.out.println("{");
//        ans5.forEach((key,value) -> {
//            System.out.println(key + ":" + value);
//        });
//        System.out.println("}");

        Double sumOfFilteredEmployeeSalary = employees.stream().filter(
                emp -> "ES".contains(emp.getDepartment().substring(0, 1).toUpperCase())
                        && emp.getSalary() > 50000
                        && emp.getAge() > 35).mapToDouble(Employee::getSalary).sum();

        System.out.println("Total Salary of Filtered Employees: " + sumOfFilteredEmployeeSalary);

        int i = 0,
                j = 1,
                k = 2;

    }
}
