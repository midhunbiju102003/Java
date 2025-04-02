import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Book {
    private String title;
    private double price;
    private Publisher publisher;

    public Book(String title, double price, Publisher publisher) {
        this.title = title;
        this.price = price;
        this.publisher = publisher;
    }

    public void display() {
        System.out.println("-----------------------------------");
        System.out.println("Title      : " + title);
        System.out.println("Price      : $" + price);
        System.out.println("Publisher  : " + (publisher != null ? publisher.getName() : "Unknown"));
        System.out.println("-----------------------------------");
    }
}

class Literature extends Book {
    public Literature(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}

class Fiction extends Book {
    public Fiction(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        // Creating publishers
        Publisher publisher1 = new Publisher("Publisher A");
        Publisher publisher2 = new Publisher("Publisher B");

        // Adding books
        books.add(new Literature("Literature Book 1", 20.99, publisher1));
        books.add(new Literature("Literature Book 2", 18.50, publisher1));
        books.add(new Fiction("Fiction Book 1", 15.75, publisher2));
        books.add(new Fiction("Fiction Book 2", 12.99, publisher2));

        // User input for category
        System.out.print("Enter the category (Literature or Fiction): ");
        String category = scanner.nextLine().trim();

        // Filtering and displaying books based on category
        boolean found = false;
        System.out.println("\nBooks in the " + category + " category:");
        for (Book book : books) {
            if ((category.equalsIgnoreCase("Literature") && book instanceof Literature) ||
                (category.equalsIgnoreCase("Fiction") && book instanceof Fiction)) {
                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found in this category. Please enter 'Literature' or 'Fiction'.");
        }

        scanner.close();
    }
}
