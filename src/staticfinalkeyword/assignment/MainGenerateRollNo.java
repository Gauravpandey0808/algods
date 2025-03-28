package staticfinalkeyword.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainGenerateRollNo {

    public static void main(String[] args) {
        GenerateRollNo generateRollNo = GenerateRollNo.generateSingletonObject();
        List<String> list = new ArrayList<>();
        System.out.print("Enter the no of student enrolled : ");
        Scanner sc = new Scanner(System.in);
        int totalStudentEnrolled=sc.nextInt();
        for(int i=0 ; i < totalStudentEnrolled ; i++) {
            list.add(generateRollNo.generateRollNo());
        }

        for(String i : list) {
            System.out.println(i);
        }

    }
}
