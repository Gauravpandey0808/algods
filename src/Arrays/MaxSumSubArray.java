package Arrays;

public class MaxSumSubArray {

    public static void main(String[] args) {

        MaxSumSubArray obj1 = new MaxSumSubArray();
        int ans = obj1.getMaxSumSubArray(new int[]{1,2,3,4,5,15,33,12}, 3);
        System.out.println(ans);

    }

    public int getMaxSumSubArray(int[] array, int k) {
        int n = array.length;
        if(n < k) return 0;

        int left = 0, right = k - 1;
        int currentSum = 0 , maxSum = 0;

        for(int i = left; i <= right; i++) {
            currentSum += array[i];
            maxSum = currentSum;
        }

        while(right + 1 < n) {
            int currentLeftValue = array[left];
            int nextRightValue = array[right + 1];
            ++left; ++right;
            currentSum -= currentLeftValue;
            currentSum += nextRightValue;

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
