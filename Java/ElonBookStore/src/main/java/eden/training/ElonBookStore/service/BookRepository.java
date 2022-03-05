/**
 * 
 */
package eden.training.ElonBookStore.service;

import java.awt.print.Book;

import org.springframework.data.repository.CrudRepository;

/**
 * @author shima
 *
 */
import eden.training.ElonBookStore.service.BookService;
public interface BookRepository extends CrudRepository<BookService, Integer> {

}
