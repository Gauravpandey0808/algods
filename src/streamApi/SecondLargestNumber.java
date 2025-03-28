package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondLargestNumber {


    public static void main(String[] args) throws Exception {
        List<Integer> numbers = List.of(5, 0, 9, 4, 7, 9, 10);

        Integer no = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new Exception("There is some issue "));
//        System.out.println(no);

        List<String> words = List.of("apple", "banana", "cherry", "blueberry", "kiwi");

        String ans = words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .findFirst().orElseThrow(() -> new Exception("THere is some issue"));

//        System.out.println(ans);

//        Sum of even numbers
        List<Integer> number = List.of(1, 13, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfOddNo = number.stream().filter(x -> x % 2 == 0).reduce(Integer::sum).get();
//        System.out.println(sumOfOddNo);

//        Second smallest no
        int x = number.stream().distinct().sorted().skip(1).findFirst().orElse(Integer.MIN_VALUE);
        System.out.println(x);

//        most frequently occurring character across all strings

        List<String> fruits = List.of("apple", "banana", "apricot");

        Long max = fruits
                .stream()
                .flatMap(fruit -> Arrays.stream(fruit.split("")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getValue)
                .orElse(null);


// Second highest no
        List<Integer> num = Arrays.asList(5, 1, 9, 3, 7, 2, 4, 9);
        int shn = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(shn);

//        Sum of largest 3 numbers

        long sumOfThreeNo = num.stream().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::valueOf).sum();

//        Sum of 5 smallest unique numbers

        long sumOfUniqueFiveNo = num.stream().distinct().sorted().limit(5).mapToInt(Integer::valueOf).sum();


//        Longest string in list
        String longestString = words.stream().max(Comparator.comparingInt(String::length))
                .get();

//        Shortest string in list
        String shortestString = words.stream().min(Comparator.comparingInt(String::length)).orElse("None");

//        Check if all no are even

        boolean isAllNoEven = num.stream().allMatch(n -> n % 2 == 0);

        boolean isOneNoEven = num.stream().anyMatch(n -> n % 2 == 0);

//        None number is negative
        boolean isAllNoPositive = num.stream().allMatch(n -> n > 0);

//        You have a list of integers, and you need to find the first number greater than 10 using Java Streams.

        int number1 = num.stream().filter(n -> n > 10).sorted().findFirst().orElse(-1);
        System.out.println(number1 == -1 ? "Not found" : number1);

//        merge all string from the list

        String a = words.stream().collect(Collectors.joining(","));
        System.out.println(a);

//        Second largest no in the array/list
        int secondLargestNo = num.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(Integer.MIN_VALUE);
        //    Third smallest unique no in the array/List
        int thirdSmallestUniqueNo = num.stream().distinct().sorted().skip(2).findFirst().orElse(Integer.MIN_VALUE);

        List<String> objects = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "ant");

        Map<Integer,List<String>> answer = objects.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(answer);


//        Reverse a string

        String sentence = "Hello World";

        String[] helloWorld = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for(int i = helloWorld.length - 1; i >= 0; i--) {
            builder.append(helloWorld[i]).append(" ");
        }

        sentence = builder.toString();
        System.out.println(sentence);

    }
}
