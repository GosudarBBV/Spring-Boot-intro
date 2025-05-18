package mate.academy.string.boot.repository;

import mate.academy.string.boot.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
}
