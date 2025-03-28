package streamApi.chatgptadvancequestions;

import java.util.*;
import java.util.stream.Collectors;

public class Course {
    int courseId;
    String courseName;
    String instructor;
    double durationInHours;
    int enrolledStudents;

    public int getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public String getInstructor() { return instructor; }
    public double getDurationInHours() { return durationInHours; }
    public int getEnrolledStudents() { return enrolledStudents; }

    Course(int courseId, String courseName, String instructor, double durationInHours, int enrolledStudents) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.durationInHours = durationInHours;
        this.enrolledStudents = enrolledStudents;
    }



    public static void main(String[] args) {

        List<Course> courseList = List.of(
                new Course(1, "Python Basics", "Alice", 10.5, 200),
                new Course(2, "Data Science", "Alice", 15.0, 250),
                new Course(3, "Java Basics", "Bob", 8.0, 300),
                new Course(4, "Java Masterclass", "Bob", 20.0, 300),
                new Course(5, "Machine Learning", "Charlie", 18.5, 400),
                new Course(6, "Deep Learning", "Charlie", 22.0, 500)
        );

        Map<String, Object> finalAnswer = courseList
                .stream()
                .collect(Collectors.groupingBy(Course::getInstructor,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> {
                            String longestCourse = list
                                    .stream()
                                    .max(Comparator.
                                            comparingDouble(Course::getDurationInHours))
                                    .map(Course::getCourseName).orElse("not found");

                            Integer totalStudents = list.stream().mapToInt(Course::getEnrolledStudents).sum();

                            List<String> totalSubjects = list.stream().map(Course::getCourseName).toList();

                            Map<String, Object> ans = new HashMap<>();

                            ans.put("Longest Course", longestCourse);
                            ans.put("Total Students", totalStudents);
                            ans.put("Courses", totalSubjects);
                            return ans;
                                })));
    }
}



