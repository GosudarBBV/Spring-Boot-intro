package mate.academy.string.boot;

import mate.academy.string.boot.model.Book;
import mate.academy.string.boot.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StringBootIntroApplication {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(StringBootIntroApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book macbeth = new Book();
            macbeth.setAuthor("William Shakespeare");
            macbeth.setTitle("Macbeth");

            Book othello = new Book();
            othello.setAuthor("William Shakespeare");
            othello.setTitle("Othello");

            bookService.save(macbeth);
            bookService.save(othello);
            System.out.println(bookService.findAll());
        };
    }
}
