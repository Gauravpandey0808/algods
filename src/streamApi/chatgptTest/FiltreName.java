package streamApi.chatgptTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FiltreName {

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Jonathan", "Eva", "Charles");

        List<String> filteredNames = names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .toList();

//        filteredNames.forEach(System.out::println);


        List<Integer> numbers = List.of(45, 75, 60, 90, 75, 30, 100, 60, 85);
        List<Integer> filteredNumber = numbers.stream().distinct().filter(x -> x >= 50).sorted().toList();
//        filteredNumber.forEach(System.out::println);

        List<String> electronicItems = List.of("Laptop1", "Mouse", "Keyboard", "Phone5", "Monitor", "Tablet");

        List<String> ans = electronicItems.stream()
        .filter(name -> !name.matches(".*\\d.*"))
                .map(String::toLowerCase)
                .sorted(Comparator.comparing(item -> (int)item.charAt(0) ))
                .toList();

//        ans.forEach(System.out::println);

        List<String> books = List.of("the great gatsby", "harry potter", "to kill a mockingbird", "the hobbit", "pride and prejudice");
        List<String> filteredBooks = books
                .stream()
                .filter(book -> book.split("\\s+").length <= 3)
                .map(book -> Arrays
                        .stream(book.split("\\s+"))
                        .map( word -> word.substring(0, 1)
                                .toUpperCase() + word
                                .substring(1))
                        .collect(Collectors.joining(" ")))
                .toList();

//        filteredBooks.forEach(System.out::println);


        List<Integer> ages = Arrays.asList(12, 25, 17, 40, 15, 18, 30, 14);
        Map<String, List<Integer>> filteredAge = ages
                .stream()
                .collect(Collectors.groupingBy(age -> {
            if(age <= 18) return "Minor";
            else return "Adult";
        }, Collectors.toList()));

//        System.out.println(filteredAge);
//        filteredAge.forEach((key, value) -> {
//            System.out.println("  \"" + key + "\": " + value);
//        });
//        System.out.println("}");

        List<String> lovableJava = List.of("I love Java",
                "Stream API is powerful",
                "Coding is fun",
                "Java is awesome",
                "Practice makes perfect"
                );

        List<String> ans2 = lovableJava
                .stream()
                .filter(character -> ! character.toLowerCase().contains("java"))
                .map(String::toUpperCase)
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        System.out.println(ans2);

    }
}
