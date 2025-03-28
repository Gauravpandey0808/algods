package streamApi.chatgptadvancequestions;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamStringQuestions {

    public static void main(String[] args) {

        String word = "aaafjfjh9tjgamamdsmrmefiwikwememd";

        Map<Character, Long> countOfChar = word.chars().mapToObj(c -> (char) c).collect( Collectors.groupingBy(c -> c.charValue(), Collectors.counting()));
        System.out.println(countOfChar);



    }
}
