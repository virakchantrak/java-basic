package contructor.exercise;

public class BookApplication {
    public static void main(String[] args) {
        BookService bookService = new BookService();
        Book[] books = bookService.createBooks(2);
        bookService.sort(books);
        bookService.print(books);
    }
}
