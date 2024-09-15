package errorhandling;

import java.util.Scanner;

public class ExceptionThrow {

    public static void AreaOfARectangle(int length , int breath) throws Exception {
        if(length < 0 || breath < 0 ) {
            throw new Exception("HappyException");
        }
    }

    public static void main(String[] args) {
        int multiplicationOfNumber = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many no you want");
        int noOfElement = sc.nextInt();
        int[] array = new int[noOfElement];
        System.out.println("Enter the "+noOfElement+" numbers");
        for(int i = 0 ; i < noOfElement ; i++) {
            array[i] = sc.nextInt();
        }

        for(int number : array) {
             multiplicationOfNumber *= number;
        }

        System.out.println(multiplicationOfNumber);
    }
}
