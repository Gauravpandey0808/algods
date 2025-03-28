package streamApi.chatgptTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductCountWithMoreThanTwoTags {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", Arrays.asList("electronics", "tech", "portable")),
                new Product("Phone", Arrays.asList("smartphone", "gadget")),
                new Product("Smartwatch", Arrays.asList("wearable", "tech")),
                new Product("Tablet", Arrays.asList("electronics", "gadget", "touchscreen")),
                new Product("Speaker", Arrays.asList("audio", "tech")),
                new Product("Lamp", Arrays.asList("home", "decor"))
        );

        long count = products.stream().map(Product::getTags).filter(tag -> tag.size() > 2).count();
//        System.out.println(count);

        String smallestNo = products
                .stream()
                .flatMap(product -> product.getTags().stream())
                .distinct()
                .min(Comparator.comparingInt(String::length))
                .orElse("There should not be empty data");

//        System.out.println(smallestNo);
        Double data = products
                .stream()
                .map(Product::getName)
                .mapToInt(String::length)
                .average()
                .orElse(0.00);

//        System.out.println(data);

//        Find the Longest Word Across All Product Names

        String data2 = products
                .stream()
                .flatMap(product -> Arrays.stream(product.name.split(" ")))
                .max(Comparator.comparingInt(String::length))
                .orElse("Nothing there");

//        System.out.println(data2);

//        Count Products with More Than One Tag

        long size = products
                .stream()
                .filter(product -> product.getTags().size() > 1)
                .count();

//        System.out.println(size);


//        Find Products That Contain a Specific Tag


        List<String> productNames = products.stream()
                .filter(product -> product.tags.contains("tech"))
                .map(Product::getName)
                .toList();


        System.out.println(productNames);

//        Group Products by First Letter

        Map<Object, List<String>> data3 = products.stream()
                .flatMap(product -> Arrays.stream(product.name.split(" ")))
                .collect(Collectors.groupingBy(word -> word.charAt(0), Collectors.toList()));

        System.out.println(data3);



//        Group Products by Tag Count

        Map<Integer, List<Product>> groupedByTagCount = products
                .stream()
                .collect(
                        Collectors.groupingBy
                                (product -> product.tags.size(),
                                        Collectors.toList()));

        System.out.println(groupedByTagCount);
    }
}


