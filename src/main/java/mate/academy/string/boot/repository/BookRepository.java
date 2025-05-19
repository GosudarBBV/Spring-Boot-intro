package mate.academy.string.boot.repository;

import java.util.List;
import mate.academy.string.boot.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
