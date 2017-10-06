module bookapp {
    requires spring.context;
    requires spring.tx;
    requires javax.inject;
    requires hibernate.core;
    requires hibernate.jpa;

    opens books.impl.entities;
    opens books.impl.service;
    opens bookstore.impl.service;

    exports books.api.service;
    exports books.api.entities;
}