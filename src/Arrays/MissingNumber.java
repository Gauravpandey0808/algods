package Arrays;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] data = new int[] {1,2,4,5,6,7,8,9};
        int n = data.length;

        int sumOfNo = Arrays.stream(data).sum();

        int sumOfNNo = (n + 1) * (n + 2) / 2;

        System.out.println(sumOfNNo - sumOfNo);
    }
}
