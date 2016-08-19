package books.impl.entities;

import books.api.entities.Book;

public class BookEntity implements Book {
  private int id;
  private String title;
  private double price;

  public BookEntity(int id, String title, double price) {
    this.id = id;
    this.title = title;
    this.price = price;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }
  
  public double getPrice() {
    return price;
  }

}
