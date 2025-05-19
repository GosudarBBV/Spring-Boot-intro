package mate.academy.string.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringBootIntroApplication {
<<<<<<< HEAD
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
            book1.setTitle("Morskit");

            Book book2 = new Book();
            book2.setAuthor("Szelw");
            book2.setTitle("AI");

            bookService.save(book1);
            bookService.save(book2);
            System.out.println(bookService.findAll());

        };
    }

}
=======
	public static void main(String[] args) {
		SpringApplication.run(StringBootIntroApplication.class, args);
	}
}
>>>>>>> master
