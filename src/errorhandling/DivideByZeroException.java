package errorhandling;

import java.util.Scanner;

public class DivideByZeroException {

    private static int division(int number1 , int number2) throws ArithmeticException {

            return number1/number2 ;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two no");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        try {
            int ans = division(number1, number2);
            System.out.println("the answer is : " + ans);
        } catch(ArithmeticException e) {
            System.out.println("The exception is this : "+e.getMessage());
        }


    }
}
