package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        String concatNames = names.stream().collect(Collectors.joining(", "));
//        System.out.println(concatNames);

        long sum = numbers.stream().mapToInt(Integer::intValue).sum();

        List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog");

        Map<Object, List<String>> ans = words.stream().collect(Collectors.groupingBy(x -> x.length()));

//        System.out.println(numbers.stream().collect(Collectors.groupingBy(x -> x % 2 == 0)));

        int sumOfData = words.stream().mapToInt(String::length).sum();
//        System.out.println(sumOfData);

//        Use Collectors to create a comma-separated string of only the odd numbers.
        String answer = numbers
                .stream()
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

//        System.out.println(answer);

        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<Object, Long> a = fruits
                .stream()
                .collect(Collectors.groupingBy(fruit -> fruit , Collectors.counting()));

        Map<Object, List<String>> p = fruits.stream().collect(Collectors.groupingBy(fruit -> fruit.charAt(0), Collectors.toList()));
//        System.out.println(p);


//        Segregate even and odd
        List<Integer> n = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Object, List<Integer>> an = n.stream()
                .collect(Collectors.groupingBy(x -> {
           return x % 2 == 0 ? "even" : "odd";
        }, Collectors.toList()));


        System.out.println(an);




    }
}
