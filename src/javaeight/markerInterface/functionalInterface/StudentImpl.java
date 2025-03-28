package javaeight.markerInterface.functionalInterface;

import java.io.Serializable;

public class StudentImpl implements Serializable {

    public static void main(String[] args) {
        Student student =  (Integer::sum);
        System.out.println(student.getTotalStudent(2, 4));

//        Json String
        String name = "Gaurav";
        int age = 28;
        String JSONString = """
                "Name": "%s",
                "Age": "%d"
                """.formatted(name, age);

        System.out.println(JSONString);
    }

}
