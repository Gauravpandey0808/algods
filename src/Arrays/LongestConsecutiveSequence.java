package Arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        LongestConsecutiveSequence obj1 = new LongestConsecutiveSequence();
        System.out.println(obj1.getLongestSequence(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}));
        System.out.println(obj1.getLongestSequence(new int[]{100, 4, 200, 1, 3, 2}));

    }

    public int getLongestSequence(int[] array) {
        int counter = 0;
        Set<Integer> numberSet = new HashSet<>();

        for (int currentNumber : array) {
            numberSet.add(currentNumber);
        }

        for (int currentNumber : array) {
            if (!numberSet.contains(currentNumber - 1)) {
                int tempCounter = 0;
                while (numberSet.contains(currentNumber)) {
                    tempCounter++;
                    currentNumber++;
                }
                counter = Math.max(tempCounter, counter);
            }
        }
        return counter;
    }
}
