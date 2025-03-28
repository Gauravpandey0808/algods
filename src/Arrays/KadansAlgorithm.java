package Arrays;

public class KadansAlgorithm {

    public static void main(String[] args) {
        int[] array = new int[]{11,14,13,-22,13,15,18};
        System.out.println(SubArrayMaxSum(array));
    }

    public static int SubArrayMaxSum(int[] array) {
        int maxSum = Integer.MIN_VALUE;
        int n = array.length;
        int currentSum = 0;

        for(int i = 0; i < n ; i++) {

            currentSum += array[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) currentSum = 0;
        }

        return maxSum;

    }
}
