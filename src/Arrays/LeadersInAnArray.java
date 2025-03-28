package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArray {

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 5, 3, 1, 2};
        List<Integer> data = getLeaders(nums);
        for(int information : data) {
            System.out.println(information);
        }

    }

    public static List<Integer> getLeaders(int[] nums) {
        List<Integer> leaderList = new ArrayList<>();
        int n = nums.length;
        leaderList.add(nums[n-1]);
        int max = nums[n-1];
        for(int i = n-2 ; i >= 0 ; i--) {
            if(max < nums[i]) {
                leaderList.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(leaderList);
        return leaderList;
    }
}
