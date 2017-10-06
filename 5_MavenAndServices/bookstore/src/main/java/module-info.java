module bookstore {
    requires books;

    exports bookstore.service.api;

    uses books.api.service.BooksService;

    provides bookstore.service.api.BookstoreService with bookstore.service.impl.BookstoreServiceImpl;
}