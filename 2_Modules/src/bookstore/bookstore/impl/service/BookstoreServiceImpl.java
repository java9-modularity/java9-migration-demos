package bookstore.impl.service;

import java.util.Arrays;
import books.api.entities.Book;
import books.api.service.BooksService;
import bookstore.api.service.BookstoreService;
import java.util.ServiceLoader;
import java.util.Iterator;
import java.util.Optional;

public class BookstoreServiceImpl implements BookstoreService {

  private static double TAX = 1.21d;

  public double calculatePrice(int... bookIds) {
    Optional<BooksService> service = ServiceLoader.load(BooksService.class).findFirst();

    if(service.isPresent()) {
      double total = Arrays
      .stream(bookIds)
      .mapToDouble(id -> service.get().getBook(id).getPrice())
      .sum();

      return total * TAX;
    }

    return 0;
  }

}
