package eclipse.group001aa.repo;

import org.springframework.data.repository.CrudRepository;

import eclipse.group001aa.domain.Book;

public interface BookRepo extends CrudRepository<Book, Long> {

}
