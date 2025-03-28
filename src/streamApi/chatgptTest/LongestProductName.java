package streamApi.chatgptTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestProductName {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", Arrays.asList("electronics", "tech", "portable")),
                new Product("Phone", Arrays.asList("smartphone", "gadget")),
                new Product("Smartwatch", Arrays.asList("wearable", "tech")),
                new Product("Tablet", Arrays.asList("electronics", "gadget", "touchscreen"))
        );

        List<String> productTags = products.stream()
                .flatMap(product -> product.getTags().stream())
                .filter(product -> product.startsWith("s") && product.length() > 5)
                .toList();

        String maxLength = products.stream()
                .map(Product::getName)
                .max(Comparator.comparingInt(String::length))
                .orElse("There is no max length");
        System.out.println(maxLength);
    }
}
