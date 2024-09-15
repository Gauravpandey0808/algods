package mathematics;


public class MathsMain {

    public static void main (String[] args){
//        counting digits in a number
        System.out.println("Worst case scenerio "+CountDigits.sendCountDigitWorstCase(12001));
        System.out.println("Best case scenerio "+CountDigits.sendCountDigitBestWay(12001));

//        Palindrome no
        System.out.println("Hi this is the program for palidrome no "+Palindrome.isPalindromeCovertStringCase(2021) );
        System.out.println("Hi this is the program for palidrome no we are not converting to string here "+Palindrome.isPalindromeModulus(20212) );

//        Factorial of a no
        System.out.println("Hi this is Factorial of a no by recursion "+Factorial.recursionFactorial(20) );

//        Trailing zeros
        System.out.println("Count trailing zeros "+ TrailingZerosFactorial.countZeros(50,5));


//        Finding GCD of numbers
        System.out.println("GCD of two no "+ GreatestCommonDivisor.findGCD(10,15));

    }
}
