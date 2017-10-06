package bookstore.service.impl;

import java.util.Arrays;
import java.util.ServiceLoader;

import books.api.service.BooksService;
import bookstore.service.api.BookstoreService;

public class BookstoreServiceImpl implements BookstoreService {

  private static double TAX = 1.21d;

  private BooksService booksService;

  public BookstoreServiceImpl() {
    this.booksService = ServiceLoader.load(BooksService.class).findFirst().get();
  }

  public double calculatePrice(int... bookIds) {
    double total = Arrays
      .stream(bookIds)
      .mapToDouble(id -> booksService.getBook(id).getPrice())
      .sum();

    return total * TAX;
  }

}
