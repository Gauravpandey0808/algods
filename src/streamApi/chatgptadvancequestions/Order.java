package streamApi.chatgptadvancequestions;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Order {

    String orderId;
    String customer;
    int amount;

    Order(String orderId, String customer, int amount) {
        this.orderId = orderId;
        this.customer = customer;
        this.amount = amount;
    }

    public String getOrderId() { return orderId; }
    public String getCustomer() { return customer; }
    public int getAmount() { return amount; }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("O1", "Alice", 250),
                new Order("O2", "Bob", 300),
                new Order("O3", "Alice", 150),
                new Order("O4", "Charlie", 400),
                new Order("O5", "Bob", 200),
                new Order("O6", "Alice", 100)
        );

        Map<String, Integer> sum = orders
                .stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summingInt(Order::getAmount)));

        System.out.println(sum);

        Map<String, IntSummaryStatistics> answer = orders
                .stream()
                .collect(Collectors.groupingBy(Order::getCustomer, Collectors.summarizingInt(Order::getAmount)));

        answer.forEach((name , stats) -> {
            System.out.println(name + "={Total= " + stats.getSum()
                    + " Average= "
                    + stats.getAverage()
                    + "}"
            );
        });

    }
}
