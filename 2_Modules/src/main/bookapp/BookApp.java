package bookapp;

import books.api.entities.Book;
import books.api.service.BooksService;
import books.impl.service.InMemoryBooksService;
import bookstore.api.service.BookstoreService;
import bookstore.impl.service.BookstoreServiceImpl;

public class BookApp {
  public static void main(String... args) {
    // Instantiation and 'wiring'
    BooksService booksService = new InMemoryBooksService();
    BookstoreService store = new BookstoreServiceImpl(booksService);

    // Create some books
    int id1 = booksService.createBook("Java 9 Modularity in Action", 45.0d);
    int id2 = booksService.createBook("Modular Cloud Apps with OSGi", 40.0d);
    printf("Created books with id [%d, %d]", id1, id2);

    // Retrieve them again
    Book book1 = booksService.getBook(id1);
    Book book2 = booksService.getBook(id2);
    printf("Retrieved books:\n  %d: %s\n  %d: %s",
      id1, book1.getTitle(), id2, book2.getTitle());

    // Use the other service to calculate a total
    double total = store.calculatePrice(id1, id2);
    printf("Total price: %1$.2f", total);
  }

  private static void printf(String msg, Object... args) {
    System.out.println(String.format(msg + "\n", args));
  }

}
