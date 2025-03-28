package streamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthSorting {

    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "kiwi", "orange", "grape", "pear", "plum", "apricot");

        List<String> ans = words.stream().sorted(Comparator.comparingInt(String::length).reversed()).toList();
//        System.out.println(ans);

        List<String> ans1 = words
                .stream()
                .sorted(Comparator.comparingInt(word -> (int)word.charAt(0)))
                .sorted(Comparator.comparingInt(String::length)).toList();
//        [kiwi, kiwi, pear, plum, apple, grape, orange, apricot, banana]
//        System.out.println(ans1);

//        Shortest word and longest word

        Object ans2 = words.stream()
                .collect(Collectors.teeing(
                        Collectors.minBy(Comparator.comparingInt(String::length)),
                        Collectors.maxBy(Comparator.comparingInt(String::length)),
                        (min, max) -> Map.of("Min value", min.orElse("N/A"), "Max Value", max.orElse("N/A"))
                ));

//        System.out.println(ans2);

        Map<String, Object> ans3 = words.stream().collect(Collectors.teeing(
                Collectors.counting(),
                Collectors.averagingInt(String::length),
                (count, average) -> Map.of("Total word count: ", count, "Average word length: ", average)
        ));

//        System.out.println(ans3);

//        Sum of word lengths: 42
//        Longest word: apricot

        Map<String, Object> ans4 = words.stream().collect(Collectors.teeing(
                Collectors.summingInt(String::length),
                Collectors.maxBy(Comparator.comparingInt(String::length)),
                (sum, longest) -> Map.of("Sum of word lengths: ", sum, " Longest word: ", longest.orElse("N/A"))
        ));

//        System.out.println(ans4);

//        Words starting with a vowel:
//        Words starting with a consonant:

        Map<String, Object> ans5 = words.stream().collect(Collectors.teeing(
                Collectors.filtering(word -> isVowel(word.charAt(0)), Collectors.counting()),
                Collectors.filtering(word -> !isVowel(word.charAt(0)), Collectors.counting()),
                (vowel, consonent) -> Map.of(
                        "Words starting with a vowel:", vowel,
                        "Words starting with a consonant:", consonent)
        ));

        System.out.println(ans5);

    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
