package mathematics;

public class CountDigits {

    public static int sendCountDigitWorstCase(int num){
        int count = 0;
        while (num > 0){
            num = num /10;
            count++;
        }
        return count;
    }

    public static int sendCountDigitBestWay(int num){
        return (int)Math.floor(Math.log10(num)+1);

    }
}
