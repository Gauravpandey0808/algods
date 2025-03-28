package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctElementsInWindow {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        DistinctElementsInWindow obj1 = new DistinctElementsInWindow();
        List<Integer> ans = obj1.getDistinctElement(numbers, k);
        System.out.println(ans);
    }

    public List<Integer> getDistinctElement(int[] numbers, int k) {
        int n = numbers.length;
        Set<Integer> uniqueElement = new HashSet<>();

        for(int i = 0; i < k; i++) {
            uniqueElement.add(numbers[i]);
        }

        List<Integer> uniqueElementCount = new ArrayList<>();

        int left = 0, right = k - 1;

        while(right < n - 1) {
            uniqueElementCount.add(uniqueElement.size());
            uniqueElement.remove(numbers[left]);
            ++left;
            ++right;
            uniqueElement.add(numbers[right]);
        }

        uniqueElementCount.add(uniqueElement.size());
        return uniqueElementCount;

    }
}
