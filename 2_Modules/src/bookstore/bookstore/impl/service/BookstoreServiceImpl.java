package bookstore.impl.service;

import books.api.entities.Book;
import books.api.service.BooksService;
import bookstore.api.service.BookstoreService;

public class BookstoreServiceImpl implements BookstoreService {

  private static double TAX = 1.21d;

  private BooksService booksService;

  public BookstoreServiceImpl(BooksService booksService) {
    this.booksService = booksService;
  }

  public double calculatePrice(int... bookIds) {
    double total = 0d;

    for(int id: bookIds) {
      Book book = booksService.getBook(id);
      total += book.getPrice();
    }

    return total * TAX;
  }

}
