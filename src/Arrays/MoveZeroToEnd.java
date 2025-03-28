package Arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static void main(String[] args) {

       int[] nums = new int[]{0, 1, 4, 0, 5, 2};

       MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();
       moveZeroToEnd.moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }

    public void moveZeroes(int[] nums) {

        int n = nums.length;
        int currentZeroPointer = 0;

        while (nums[currentZeroPointer] != 0) currentZeroPointer++;

        int currentPointer = currentZeroPointer + 1;

        while (currentPointer < n) {
            while (currentPointer < n && nums[currentPointer] == 0) currentPointer++;

            if (currentPointer < n) {
                nums[currentZeroPointer] = nums[currentPointer];
                nums[currentPointer] = 0;
                currentZeroPointer++;
                currentPointer++;
            }
        }
    }

}
