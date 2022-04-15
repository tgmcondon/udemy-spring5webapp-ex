package eclipse.group001aa.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import eclipse.group001aa.domain.Publisher;
import eclipse.group001aa.repo.PublisherRepo;

@Component
public class BootStrapData implements CommandLineRunner {
	
	private final PublisherRepo publisherRepo;
		
	public BootStrapData(PublisherRepo inPublisherRepo) {
		this.publisherRepo = inPublisherRepo;
		
		Publisher pub = new Publisher();
		pub.setName("name01");
		
		publisherRepo.save(pub);
		
		System.out.println("Publisher Count: " + publisherRepo.count());
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		
	}

}
