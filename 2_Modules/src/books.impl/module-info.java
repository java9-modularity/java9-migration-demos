module books.impl {
  requires books.api;

  provides books.api.service.BooksService with books.impl.service.InMemoryBooksService;
}
