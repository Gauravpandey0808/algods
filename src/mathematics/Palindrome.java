package mathematics;

public class Palindrome {

    public static boolean isPalindromeCovertStringCase(int num) {
        String number = Integer.toString(num);
        int i = 0;
        int j = number.length() - 1;
        boolean flag = false;
        while (i < j) {
            if (number.charAt(i) == number.charAt(j)) {
                i++;
                j--;
            } else {
                break;
            }

        }
        if (i >= j){
            flag = true;
        }
        return flag;

    }


//    Another way of doing this solution
    public static boolean isPalindromeModulus(int i ){
        int j = 10;
        int k = i;
        int l = 0;
        while ( k != 0){
            int carryOn = 0;
            carryOn = k % 10;
            k = k/10;
            l = (l + carryOn) * j;
        }
        int reverseNumber = l/10;
        return (i == reverseNumber) ? true : false;


    }

}
