package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class QuestionSeventh {
    public static void main(String[] args) {
        List<String> csvData = Arrays.asList(
                "apple,banana,orange",
                "banana,grape,apple",
                "orange,grape,kiwi"
        );

        // Use flatMap() to extract unique values
        List<String> uniqueValues = csvData.stream()
                .flatMap(fruitsList -> Arrays.stream(fruitsList.split(",")))
                .distinct()
                .toList();

        System.out.println(uniqueValues); // Expected: [apple, banana, orange, grape, kiwi]

    }
}


