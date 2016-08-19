package books.api.service;

import books.api.entities.Book;

public interface BooksService {
  Book getBook(int id);
  int storeBook(Book book);
}
