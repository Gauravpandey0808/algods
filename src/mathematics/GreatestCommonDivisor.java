package mathematics;

public class GreatestCommonDivisor {

    public static int findGCD(int a ,int b){
        if (b == 0){
            return a;
        }

        return findGCD(b , a%b);
    }
}
