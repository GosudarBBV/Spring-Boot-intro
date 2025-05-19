package mate.academy.string.boot.service;

import java.util.List;
import mate.academy.string.boot.model.Book;

public interface BookService {

    Book save(Book book);

    List<Book> findAll();
}
