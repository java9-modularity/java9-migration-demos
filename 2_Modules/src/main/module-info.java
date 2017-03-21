module main {
  requires books.impl;
  requires bookstore;

  uses books.api.service.BooksService;
  uses bookstore.api.service.BookstoreService;
}
