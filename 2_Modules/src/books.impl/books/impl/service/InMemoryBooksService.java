package books.impl.service;

import books.api.entities.Book;
import books.api.service.BooksService;
import java.util.concurrent.ConcurrentHashMap;

public class InMemoryBooksService implements BooksService {

  private ConcurrentHashMap<Integer, Book> books = new ConcurrentHashMap<>();

  public Book getBook(int id) {
    return books.get(id);
  }

  public int storeBook(Book book) {
    books.putIfAbsent(book.getId(), book);
    return book.getId();
  }

}
