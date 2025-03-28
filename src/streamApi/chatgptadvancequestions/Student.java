package streamApi.chatgptadvancequestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {

    String name;
    String grade;
    int score;

    Student(String name, String grade, int score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public String getName() { return name; }
    public String getGrade() { return grade; }
    public int getScore() { return score; }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", "A", 90),
                new Student("Bob", "A", 85),
                new Student("Charlie", "B", 75),
                new Student("David", "B", 80),
                new Student("Eve", "C", 60),
                new Student("Frank", "C", 70)
        );


        Map<String, Double> data = students
                .stream()
                .collect(Collectors.groupingBy(Student::getGrade, Collectors.averagingLong(Student::getScore)));

        System.out.println(data);


    }
}
