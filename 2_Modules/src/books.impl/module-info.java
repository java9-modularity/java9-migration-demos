module books.impl {
  requires public books.api;

  exports books.impl.entities;
  exports books.impl.service;
}
