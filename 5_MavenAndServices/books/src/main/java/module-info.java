module books {
    requires hibernate.jpa;
    exports books.api.entities;
    exports books.api.service;

    opens books.impl.entities;

    provides books.api.service.BooksService with books.impl.service.HibernateBooksService;
}