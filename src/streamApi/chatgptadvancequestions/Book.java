package streamApi.chatgptadvancequestions;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    String title;
    String author;
    double price;
    String genre;
    int pages;

    Book(String title, String author, double price, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.pages = pages;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }

    public static void main(String[] args) {
        List<Book> getBooks = List.of(
                new Book("The Hobbit", "J.R.R. Tolkien", 15.99, "Fantasy", 310),
                new Book("Harry Potter", "J.K. Rowling", 20.99, "Fantasy", 500),
                new Book("The Catcher in the Rye", "J.D. Salinger", 12.99, "Classic", 214),
                new Book("To Kill a Mockingbird", "Harper Lee", 18.50, "Classic", 281),
                new Book("1984", "George Orwell", 14.99, "Dystopian", 328),
                new Book("Brave New World", "Aldous Huxley", 13.99, "Dystopian", 288)
        );

        Map<String, Object> finalAns = getBooks
                .stream()
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.collectingAndThen(
                        Collectors.toList() ,
                        list -> {
                            String mostExpBook = list
                                    .stream()
                                    .max(Comparator.comparingDouble(Book::getPrice))
                                    .map(Book::getTitle).orElse("No book found");
                            int totalPages = list
                                    .stream()
                                    .mapToInt(Book::getPages)
                                    .sum();

                            List<String> allBooks = list.stream().map(Book::getTitle).toList();

                            Map<String, Object> ans = new HashMap<>();

                            ans.put("Most Expensive Book", mostExpBook);
                            ans.put("Total Pages", totalPages);
                            ans.put("Books", allBooks);
                            return ans;
                        })));

        System.out.println(finalAns);
    }
}
