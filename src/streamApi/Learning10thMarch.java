package streamApi;

import java.util.Arrays;
import java.util.List;

public class Learning10thMarch {

    public static void main(String[] args) {

//        Short circuit methods

        int[] arr = new int[]{1,3,4,5,6,2,10,8,7};


        boolean ans = Arrays.stream(arr).allMatch(number -> number % 2 == 0);
//        System.out.println(ans);

//        Length of string is greater than 3

        String[] stringArray = new String[] {"Gaurav", "Sai", "Priya", "gp", "div", "Aru"};

        List<String> arrayFiltre = Arrays.stream(stringArray).filter(name -> name.length() > 3).toList();

//        arrayFiltre.forEach(System.out::println);

//        Squaring and sorting numbers

        List<Integer> numbers = List.of(10, 2, 20, 11, 15, 6, 7, 15, 23, 25, 33, 26);

        List<Integer> sortedNumber = numbers.stream().map(number -> number * number).sorted().toList();
//        sortedNumber.forEach(System.out::println);

//        Sum of array

        numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = numbers.stream().reduce(Integer::sum).orElse(0);
//        System.out.println(sum);

//        Count how many time a character is occuring in the String

        String word = "Hello World";

        long countOfL = word.chars().filter(character -> character == 'l').count();
        System.out.println(countOfL);

    }
}
