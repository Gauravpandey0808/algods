package mathematics;

public class TrailingZerosFactorial {

    public static int countZeros(int n, int j ){
        if (n < j){
            return 0 ;
        }

        return  (n/j) + countZeros(n,j*j);

    }

}
