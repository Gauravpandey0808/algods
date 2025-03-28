package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class QuestionFirst {

    public static void main(String[] args) {
        List<List<Integer>> nestedList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

// Use flatMap() to flatten the list
        List<Integer> flattenedList = nestedList.stream().flatMap(List::stream).toList();

        System.out.println(flattenedList); // Expected: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
