package streamApi.LamdaExpressions;

import java.util.List;

public class StreamApiDemo {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);

        boolean allMatch = numbers.stream().allMatch(x -> x > 0);
        boolean anyMatch = numbers.stream().anyMatch(x -> x > 0);
        boolean noneMatch = numbers.stream().noneMatch(x -> x > 0);
//        System.out.println("all Match: " + allMatch  + ", anyMatch : " + anyMatch + ", noneMatch: " + noneMatch);

        Integer firstNo = numbers.stream().findAny().get();
        System.out.println(firstNo);

        List<String> names = List.of("Gaurav", "Ana", "Arpita", "Dev", "Sanjana", "Deep", "Sam", "den");

//        names.stream().filter(x -> x.length() > 3).forEach(System.out::println);

        //Square of the numbers

//        System.out.println(numbers.stream().map(Math::sqrt).toList());

//        System.out.println(numbers.stream().reduce(Integer::sum).get());


        String name = "Ghansyam Punetha";

        System.out.println(name.chars().filter(x -> x == 'a').count());


    }
}
