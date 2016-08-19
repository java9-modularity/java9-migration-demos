module bookstore {
  requires books.api;

  exports bookstore.api.service;
  exports bookstore.impl.service;
}
