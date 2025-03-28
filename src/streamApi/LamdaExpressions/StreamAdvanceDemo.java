package streamApi.LamdaExpressions;

import streamApi.LamdaExpressions.request.Students;
import streamApi.LamdaExpressions.request.Subjects;

import java.util.List;

public class StreamAdvanceDemo {
    public static void main(String[] args) {
        List<Students> twelfthClassData = List.of(new Students(12,
                1, List.of(createSubjectData("Math", 50),
                createSubjectData("Science", 98),
                createSubjectData("Hindi", 77)),
                "Gaurav Pandey"),
                new Students(12,
                        2, List.of(createSubjectData("Math", 16),
                        createSubjectData("Science", 31),
                        createSubjectData("Hindi", 55)),
                        "Sachin Tichkule"),
                new Students(12,
                        3, List.of(createSubjectData("Math", 17),
                        createSubjectData("Science", 77),
                        createSubjectData("Hindi", 74)),
                        "Naveen Patnayak"),
                new Students(12,
                        4, List.of(createSubjectData("Math", 70),
                        createSubjectData("Science", 34),
                        createSubjectData("Hindi", 64)),
                        "Bihari Lal")
        );

        twelfthClassData.stream()
                .flatMap(studentData -> studentData.getSubjectsList().stream())
                .filter(subjectMarks -> subjectMarks.getSubject().equals("Math"))
                ;



    }


    private static Subjects createSubjectData(String subject, int marks) {
        return new Subjects(subject, marks);
    }
}
