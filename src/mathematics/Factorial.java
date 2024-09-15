package mathematics;

public class Factorial {

    public static long recursionFactorial(long n){
        if (1 == n || 0 == n){
            return 1;
        }
        long multiple = (n * recursionFactorial(n-1));
        return multiple;
    }

}
