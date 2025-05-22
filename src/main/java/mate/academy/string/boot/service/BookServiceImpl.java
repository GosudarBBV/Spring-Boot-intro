package mate.academy.string.boot.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.string.boot.model.Book;
import mate.academy.string.boot.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository repository;

    @Override
    public Book save(Book book) {
        return repository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }
}
