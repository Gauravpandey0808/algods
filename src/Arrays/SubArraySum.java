package Arrays;

public class SubArraySum {

    public int[] subArraySum(int[] intArray, int target) {
        int n = intArray.length;
        int left = 0, sum = 0;

        for(int right = 0; right < n; right++) {
            sum += intArray[right];
            while(sum > target && left <= right) {
                sum -= intArray[left];
                left++;
            }

            if(sum == target) {
                int length = right - left + 1;
                int[] ans = new int[length];
                for(int i = left; i <= right; i++) {
                    ans[i - left] = intArray[i];
                }
                return ans;
            }
        }

        return new int[]{Integer.MIN_VALUE};
    }

    public static void main(String[] args) {

    }
}
