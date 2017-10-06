package main;

import books.api.entities.Book;
import books.api.service.BooksService;
import bookstore.service.api.BookstoreService;

import java.util.ServiceLoader;

public class Main {

  public void start() {
    System.out.println("Starting...");

    BooksService booksService = ServiceLoader.load(BooksService.class).findFirst().get();
    BookstoreService store = ServiceLoader.load(BookstoreService.class).findFirst().get();

      // Create some books
      int id1 = booksService.createBook("Java 9 Modularity", 45.0d);
      int id2 = booksService.createBook("Modular Cloud Apps with OSGi", 40.0d);
      printf("Created books with id [%d, %d]", id1, id2);

      // Use the other service to calculate a total
      double total = store.calculatePrice(id1, id2);
      printf("Total price (with tax): %.2f", total);

      System.exit(0);

  }

  public static void main(String[] args) {
    new Main().start();
  }

  private void printf(String msg, Object... args) {
      System.out.println(String.format(msg + "\n", args));
    }
}
