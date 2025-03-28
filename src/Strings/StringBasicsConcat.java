package Strings;

import java.util.Scanner;

public class StringBasicsConcat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name : ");
        String fName = sc.nextLine();
        System.out.println("Enter the middle name : ");
        String mName = sc.nextLine();
        System.out.println("Enter the last name : ");
        String lName = sc.nextLine();
        StringBasicsConcat obj1 = new StringBasicsConcat();
        String fullName = obj1.getFullName(fName, mName, lName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.startsWith("gaurav"));




    }

    public String getFullName(String fName, String mName, String lName) {
        return fName + " " + mName + " " + lName.strip();
    }
}
