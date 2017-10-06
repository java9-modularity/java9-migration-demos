package books.impl.service;

import books.api.entities.Book;
import books.api.service.BooksService;
import books.impl.entities.BookEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class HibernateBooksService implements BooksService {
  private EntityManagerFactory entityManagerFactory;

  public HibernateBooksService() {
    this.entityManagerFactory = Persistence.createEntityManagerFactory("books");
  }

  public Book getBook(int id) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    TypedQuery<Book> query = entityManager.createQuery("SELECT book from BookEntity book where book.id = :id", Book.class);
    query.setParameter("id", id);
    return query.getSingleResult();
  }

  public int createBook(String title, double price) {

    BookEntity entity = new BookEntity(title, price);
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(entity);
    entityManager.getTransaction().commit();

    return entity.getId();
  }

}
