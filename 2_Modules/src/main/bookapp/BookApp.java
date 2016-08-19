package bookapp;

import books.api.entities.Book;
import books.api.service.BooksService;
import books.impl.entities.BookEntity;
import books.impl.service.InMemoryBooksService;

public class BookApp {
  public static void main(String... args) {
    BooksService booksService = new InMemoryBooksService();
    booksService.storeBook(new BookEntity(1, "Java 9 Modularity in Action", 10.0d));

    System.out.println("BookApp!");
    Book book = booksService.getBook(1);
    System.out.println("Book: " + book.getTitle());
  }
}
