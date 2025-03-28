package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    List<String> skills;

    Employee(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public List<String> getSkills() {
        return skills;
    }
}


public class QuestionFifth {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Arrays.asList("Java", "Spring")),
                new Employee("Bob", Arrays.asList("Kafka", "Spring Boot")),
                new Employee("Charlie", Arrays.asList("Java", "Docker"))
        );

        // Use flatMap() to extract unique skills
        List<String> uniqueSkills = employees.stream().flatMap(employeeData -> employeeData.getSkills().stream()).distinct().collect(Collectors.toList());

        System.out.println(uniqueSkills); // Expected: [Java, Spring, Kafka, Spring Boot, Docker]
    }

}




