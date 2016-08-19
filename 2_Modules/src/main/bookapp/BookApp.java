package bookapp;

import books.api.entities.Book;
import books.api.service.BooksService;
import books.impl.service.InMemoryBooksService;
import bookstore.api.service.BookstoreService;
import bookstore.impl.service.BookstoreServiceImpl;

public class BookApp {
  public static void main(String... args) {
    BooksService booksService = new InMemoryBooksService();
    BookstoreService store = new BookstoreServiceImpl(booksService);

    int id1 = booksService.createBook("Java 9 Modularity in Action", 45.0d);
    int id2 = booksService.createBook("Modular Cloud Apps with OSGi", 40.0d);

    System.out.println(String.format("Created books with id [%1d, %2d]", id1, id2));
    Book book1 = booksService.getBook(id1);
    Book book2 = booksService.getBook(id2);
    System.out.println(String.format("Retrieved book %1d: %2s ", id1, book1.getTitle()));
    System.out.println(String.format("Retrieved book %1d: %2s ", id2, book2.getTitle()));
    double total = store.calculatePrice(id1, id2);
    System.out.println(String.format("Total price: %1$.2f", total));
  }
}
