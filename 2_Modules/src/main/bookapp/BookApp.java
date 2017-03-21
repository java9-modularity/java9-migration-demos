package bookapp;

import books.api.entities.Book;
import books.api.service.BooksService;
import bookstore.api.service.BookstoreService;
import java.util.ServiceLoader;

public class BookApp {
  public static void main(String... args) {
    // Instantiation and 'wiring'
    BooksService booksService = ServiceLoader.load(BooksService.class).findFirst().get();
    BookstoreService store = ServiceLoader.load(BookstoreService.class).findFirst().get();

    // Create some books
    int id1 = booksService.createBook("Java 9 Modularity", 45.0d);
    int id2 = booksService.createBook("Modular Cloud Apps with OSGi", 40.0d);
    printf("Created books with id [%d, %d]", id1, id2);

    // Retrieve them again
    Book book1 = booksService.getBook(id1);
    Book book2 = booksService.getBook(id2);
    printf("Retrieved books:\n  %d: %s [%.2f]\n  %d: %s [%.2f]",
      id1, book1.getTitle(), book1.getPrice(), id2, book2.getTitle(), book2.getPrice());

    // Use the other service to calculate a total
    double total = store.calculatePrice(id1, id2);
    printf("Total price (with tax): %.2f", total);
  }

  private static void printf(String msg, Object... args) {
    System.out.println(String.format(msg + "\n", args));
  }

}
