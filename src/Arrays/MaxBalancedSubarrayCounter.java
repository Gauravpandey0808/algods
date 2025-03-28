package Arrays;

public class MaxBalancedSubarrayCounter {

    public static void main(String[] args) {
        MaxBalancedSubarrayCounter obj1 = new MaxBalancedSubarrayCounter();
        int ans = obj1.getMaxBalancedSubArrayCounter(new int[]{0, 1, 1, 0, 1, 0, 1});
        System.out.println(ans);

        int ans1 = obj1.getMaxBalancedSubArrayCounter(new int[]{0, 1, 0, 1, 1, 0, 1, 0});
        System.out.println(ans1);
    }

    public int getMaxBalancedSubArrayCounter(int[] array) {
        int zeroCounter = 0 , oneCounter = 0;


        for(int number : array) {
            if (number == 0) zeroCounter++;
            else oneCounter++;
        }

        return Math.min(zeroCounter, oneCounter) * 2;

    }
}
