package eclipse.group001aa.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import eclipse.group001aa.domain.Book;
import eclipse.group001aa.domain.Publisher;
import eclipse.group001aa.repo.BookRepo;
import eclipse.group001aa.repo.PublisherRepo;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final PublisherRepo publisherRepo;
	private final BookRepo bookRepo;
		
	public BootStrapData(PublisherRepo inPublisherRepo, BookRepo inBookRepo) {
		this.publisherRepo = inPublisherRepo;
		this.bookRepo = inBookRepo;
		
		Publisher pub = new Publisher();
		pub.setName("name01");
		
		Book book = new Book();
		book.setName("book01");
		bookRepo.save(book);
		
		pub.getBooks().add(book);
		book.setPublisher(pub);
		
		publisherRepo.save(pub);
		bookRepo.save(book);
		
		System.out.println("Publisher Count: " + publisherRepo.count());
		
		
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		
	}

}
