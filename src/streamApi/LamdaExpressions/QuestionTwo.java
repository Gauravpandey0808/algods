package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionTwo {

    public static void main(String[] args) {
        List<String> sentences = Arrays.asList(
                "Java is great",
                "Java Streams are powerful",
                "Streams simplify Java"
        );

        // Use flatMap() to extract words and sort them
        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(words); // Expected: [Java, Streams, are, great, is, powerful, simplify]

    }



}
