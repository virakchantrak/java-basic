package contructor.exercise;

public class BookService {

    public Book[] createBooks(int n) {
        Book[] books = new Book[n];

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + (i + 1));
            books[i] = createBook();
        }

        return books;
    }

    public void sort(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for(int j  = i + 1; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    Book tmp = books[i];
                    books[i] = books[j];
                    books[j] = tmp;
                }
            }
        }
    }

    public void print(Book[] books) {
        for(Book book: books) {
            System.out.println(book.toString());
        }
    }

    public Book createBook() {
        String title = Utils.getString("Please input title: ");
        double price = Utils.getDouble("Please input price: ");
        String author = Utils.getString("Please input author: ");

        return new Book(title, price, author);
    }
}
