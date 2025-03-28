package streamApi.chatgptTest;

import java.util.Arrays;
import java.util.List;

class Product {
    String name;
    List<String> tags;

    Product(String name, List<String> tags) {
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

class MainExecutable {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", Arrays.asList("electronics", "tech", "portable")),
                new Product("Phone", Arrays.asList("smartphone", "gadget")),
                new Product("Smartwatch", Arrays.asList("wearable", "tech")),
                new Product("Tablet", Arrays.asList("electronics", "gadget", "touchscreen")));



    }
}

