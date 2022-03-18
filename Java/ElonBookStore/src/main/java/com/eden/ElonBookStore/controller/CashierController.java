/**
 * 
 */
package com.eden.ElonBookStore.controller;





import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eden.ElonBookStore.model.dto.Books;
import com.eden.ElonBookStore.model.dto.Buys;
import com.eden.ElonBookStore.service.BookService;
import com.eden.ElonBookStore.service.BuyService;

/**
 * @author shima
 *
 */

@Controller
@RequestMapping("/cashier")
public class CashierController {
	@Autowired
	private BuyService buyService;
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping
	private String home() {
		return "CashierHome";
	}
	
	@RequestMapping("/booklist/buy")
	  public String buy(Model model) {
		Buys buy = new Buys();
		model.addAttribute("user", buy);
		  return "Buy";
	  }

	@RequestMapping("/booklist/buy/{isbn}")
	public String buyBook(@PathVariable("isbn") String isbn) {
		Books book = new Books();
		Buys buy = new Buys();
		book = bookService.loadBookById(isbn);
		
		buy.setIsbn(book.getIsbn());
		buy.setTitle(book.getTitle());
		buy.setTitleKana(book.getTitleKana());
		buy.setPrice(book.getPrice());
		buy.setDiscount(book.getDiscount());
		buy.setPublisher(book.getPublisher());
		buy.setAuthor(book.getAuthor());
		buy.setAuthorKana(book.getAuthorKana());
		buy.setGenre(book.getGenre());
		buy.setCrDate(book.getCrDate());
		buyService.saveBuy(buy);

		return "redirect:/cashier/booklist";
	}
	
	@RequestMapping("/booklist")
	private String getAllBooks(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "CashierBookList";
	}
	@RequestMapping("/booklist/isbn")
	private String getAllBooksIsbn(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "CashierBookList";
	}
	@RequestMapping("/booklist/title")
	private String getAllBooksTitle(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "CashierBookList";
	}
	
	@RequestMapping("/booklist/isbn/{isbn}")
	public String searchBookByIsbn(@PathVariable("isbn") String isbn, Model model) {
		try {
			Books book = bookService.loadBookById(isbn);
			List<Books> list = new ArrayList<Books>();
			list.add(book);
			model.addAttribute("allBooks", list);
			return "CashierBookList";
		} catch (Exception e) {
			return "Error";
		}
	}
	
	@RequestMapping("/booklist/title/{title}")
	public String searchBookByTitle(@PathVariable("title") String title, Model model) {
		try {
			List<Books> list = bookService.searchByTitle(title);	
			if(list.size()==0) {
				return "Error";
			}
			model.addAttribute("allBooks", list);
			return "CashierBookList";
		} catch (Exception e) {
			return "Error";
		}
	}
	
	
	@RequestMapping("/history")
	  public String buyHistory(Model model) {
		List<Buys> list = buyService.loadAllBuys();
		model.addAttribute("allBuys", list);
		  return "CashierBuyHistory";
	  }
	
	@RequestMapping("/account-detail")
	  public String accountDetail(Model model) {
		Buys buy = new Buys();
		model.addAttribute("user", buy);
		  return "AccountDetail";
	  }

}
