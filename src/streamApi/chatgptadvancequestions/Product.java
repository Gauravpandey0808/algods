package streamApi.chatgptadvancequestions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("iPhone", "Electronics", 999.99),
                new Product("Samsung TV", "Electronics", 1500.00),
                new Product("MacBook", "Electronics", 2000.00),
                new Product("Bread", "Groceries", 2.50),
                new Product("Milk", "Groceries", 3.00),
                new Product("Cheese", "Groceries", 5.00),
                new Product("Nike Shoes", "Fashion", 120.00),
                new Product("Adidas Jacket", "Fashion", 200.00)
        );

        Map<String, String> productData = products
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getPrice)),
                                product -> product.map(Product::getName).orElse("No product") )));




    }
}
