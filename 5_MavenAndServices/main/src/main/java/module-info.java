module main {
    requires books;
    requires bookstore;

    uses bookstore.service.api.BookstoreService;
    uses books.api.service.BooksService;
}