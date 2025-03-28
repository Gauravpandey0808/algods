package Arrays;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;

        MaxSubArraySum obj1 = new MaxSubArraySum();
        int ans = obj1.getSubArraySum(nums, k);
        System.out.println(ans);

    }

    public int getSubArraySum(int[] nums, int k) {
        int n = nums.length;
        int leftPointer = 0, rightPointer = 0;
        int currentSum = 0;

        while(rightPointer < k) {
            currentSum += nums[rightPointer++];
        }

        int maxSum = currentSum;

        while(rightPointer < n) {
            currentSum += nums[rightPointer++];
            currentSum -= nums[leftPointer++];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
