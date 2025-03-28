package streamApi.LamdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order {
    List<Product> products;

    Order(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}


public class QuestionSixth {

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(Arrays.asList(new Product("Laptop"), new Product("Mouse"))),
                new Order(Arrays.asList(new Product("Keyboard"), new Product("Monitor")))
        );

        // Use flatMap() to extract product names
        List<String> productNames = orders.stream()
                .flatMap(order ->  order.getProducts().stream())
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println(productNames); // Expected: [Laptop, Mouse, Keyboard, Monitor]
    }
}



