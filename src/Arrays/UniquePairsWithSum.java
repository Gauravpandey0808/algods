package Arrays;

import java.util.*;

public class UniquePairsWithSum {
    public static void main(String[] args) {
        UniquePairsWithSum obj1 = new UniquePairsWithSum();
        List<List<Integer>> ans = obj1.getUniqueSum(new int[]{4, 4, 2, 2, 6, 6, 8, 8}, 10);
        System.out.println(ans);


    }

    public List<List<Integer>> getUniqueSum(int[] nums, int k ) {
        int n = nums.length;
        Set<Integer> uniquePair = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        for(int number : nums) {
            uniquePair.add(number);
        }

        for(int i = 0; i < n; i++) {
            int currentNo = nums[i];
            int requiredNo = k - currentNo;

            if(uniquePair.contains(requiredNo)) {
                ans.add(List.of(currentNo, requiredNo));
                uniquePair.remove(requiredNo);
                uniquePair.remove(currentNo);
            }
        }

        return ans;
    }


}
