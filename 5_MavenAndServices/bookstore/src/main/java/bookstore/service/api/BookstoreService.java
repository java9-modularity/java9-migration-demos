package bookstore.service.api;

import books.api.service.BooksService;

public interface BookstoreService {
  double calculatePrice(int... bookIds);
}
