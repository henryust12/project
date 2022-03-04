/**
 * 
 */
package eden.training.ElonBookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shima
 *
 */
@Controller
public class BookController {
	@GetMapping("/booklist")
	public String bookList() {
		return "BookList";
	}
	
	@GetMapping("/bookentry")
	public String bookEntry() {
		return "BookEntry";
	}
	
	@GetMapping("/bookupdate")
	public String bookUpdate() {
		return "BookUpdate";
	}
	
	@GetMapping("/bookdelete")
	public String bookDelete() {
		return "deleted";
	}
	
	
	
}
