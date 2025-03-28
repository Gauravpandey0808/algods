package Arrays;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int[] targetedData = getPair(nums,target);

        for(int data : targetedData ) {
            System.out.println(data);
        }
    }

    public static int[] getPair(int[] nums , int target) {
        Map<Integer,Integer> numsMap = new HashMap<>();

        for(int i=0 ;i < nums.length ; i++) {
            int getNumber = target - nums[i];
            if (numsMap.containsKey(getNumber)) {
                return new int[]{i,numsMap.get(getNumber)};
            }
            numsMap.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
