package Strings;

import java.util.Scanner;

public class LearningStringBasics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String myWord = sc.nextLine();
        String mySecondWord = sc.next();

        if(myWord.equals(mySecondWord)) {
            System.out.println("Both the strings are same");
        }

//       toUpperCase method is used to make the string to uppercase
        String upperCaseMyWord = myWord.toUpperCase();
        System.out.println(upperCaseMyWord);

//        toLowerCase method is used to make the string to the lowerCase
        String lowerCaseMyWord = myWord.toLowerCase();
        System.out.println(lowerCaseMyWord);

//         subString() method is used to get the substring from the string starting and end is defined inside this method
        String myWordSubString = myWord.substring(2,myWord.length() - 2);
        System.out.println(myWordSubString);
    }
}
