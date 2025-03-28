package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NonEmptyListQuestion {

    public static void main(String[] args) {
        Map<String, List<Integer>> numberMap = new HashMap<>();
        numberMap.put("evens", Arrays.asList(2, 4, 6));
        numberMap.put("odds", Arrays.asList(1, 3, 5));
        numberMap.put("primes", Arrays.asList(2, 3, 5, 7));

// Use flatMap() to get a List<Integer> of all values
        List<Integer> numbers = numberMap.values().stream().flatMap(List::stream).collect(Collectors.toList());

        System.out.println(numbers); // Expected: [2, 4, 6, 1, 3, 5, 2, 3, 5, 7]
    }
}
