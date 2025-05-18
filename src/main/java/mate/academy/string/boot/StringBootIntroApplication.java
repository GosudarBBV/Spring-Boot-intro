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
			Book book1 = new Book();
			book1.setAuthor("Kotlaras");
			book1.setPages(222);
			bookService.save(book1);
			System.out.printf("info", bookService.findAll());

		};
	}

}