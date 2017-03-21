module bookstore {
  requires transitive books.api;

  exports bookstore.api.service;

  provides bookstore.api.service.BookstoreService with bookstore.impl.service.BookstoreServiceImpl;
  uses books.api.service.BooksService;
}
