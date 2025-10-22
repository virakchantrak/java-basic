package contructor.exercise;

import java.util.Scanner;

public class BookService {

    public Book[] createBooks(int n) {
        Book[] books = new Book[n];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + (i + 1));
            books[i] = createBook();
        }

        return books;
    }

    public void print(Book[] books) {
        for(Book book: books) {
            System.out.println(book.toString());
        }
    }

    public Book createBook() {
        String title = getString("Please input title: ");
        double price = getDouble("Please input price: ");
        String author = getString("Please input author: ");

        Book book = new Book(title, price, author);
        return book;
    }

    public String getString(String label) {
        System.out.println(label);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public double getDouble(String label) {
        return Double.parseDouble(getString(label));
    }
}
