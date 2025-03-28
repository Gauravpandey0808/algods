package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;

public class ExtractEvenLengthWords {

    public static void main(String[] args) {
//        List<String> words = Arrays.asList("apple", "banana", "pear", "grape", "kiwi");
//
//        List<String> fruitEvenList = words.stream()
//                .flatMap(fruits -> Arrays.stream(fruits.split(",")))
//                .filter(fruits -> fruits.length() % 2 == 0).toList();
//
//        System.out.println(fruitEvenList);

//        List<String> words = Arrays.asList("apple", "banana", "pear", "grape");
//
//        words.stream().flatMap(fruit -> Arrays.stream(fruit.split(""))).distinct().sorted().forEach(System.out::println);


        List<Products> products = Arrays.asList(
                new Products("Laptop", Arrays.asList("electronics", "tech", "portable")),
                new Products("Phone", Arrays.asList("smartphone", "gadget")),
                new Products("Smartwatch", Arrays.asList("wearable", "tech")),
                new Products("Tablet", Arrays.asList("electronics", "gadget", "touchscreen"))
        );


        products.stream().filter(product -> product.tags.contains("tech"))
                .map(Products::getName)
                .distinct()
                .forEach(System.out::println);

    }
}
class Products {
    String name;
    List<String> tags;

    Products(String name, List<String> tags) {
        this.name = name;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }
}
