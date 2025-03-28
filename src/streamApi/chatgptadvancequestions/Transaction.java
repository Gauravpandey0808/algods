package streamApi.chatgptadvancequestions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {
    int id;
    String category;
    double amount;
    String status;

    Transaction(int id, String category, double amount, String status) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.status = status;
    }

    public int getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getStatus() { return status; }


    public static void main(String[] args) {
        List<Transaction> transactions = List.of(
                new Transaction(1, "Food", 50.0, "SUCCESS"),
                new Transaction(2, "Food", 20.0, "FAILED"),
                new Transaction(3, "Food", 30.0, "SUCCESS"),
                new Transaction(4, "Electronics", 300.0, "SUCCESS"),
                new Transaction(5, "Electronics", 150.0, "FAILED"),
                new Transaction(6, "Electronics", 500.0, "PENDING"),
                new Transaction(7, "Clothing", 100.0, "SUCCESS"),
                new Transaction(8, "Clothing", 40.0, "FAILED"),
                new Transaction(9, "Clothing", 200.0, "SUCCESS")
        );

        Map<String, Object> ans = transactions
                .stream()
                .collect(Collectors.groupingBy(Transaction::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                student -> {
                                    double totalSuccessful = student
                                            .stream()
                                            .filter(t -> t.getStatus().equals("SUCCESS"))
                                            .mapToDouble(Transaction::getAmount)
                                            .sum();

                                    double failedCount = student
                                            .stream()
                                            .filter(t -> t.getStatus().equals("SUCCESS"))
                                            .count();

                                    Map<String, Object> summary = new HashMap<>();
                                    summary.put("Total Successful Amount", totalSuccessful);
                                    summary.put("Failed Count", failedCount);
                                    return summary;
                                 })));

    }

}
