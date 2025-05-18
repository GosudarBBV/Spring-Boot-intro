package mate.academy.string.boot.service;

import mate.academy.string.boot.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);
    List<Book> findAll();
}
