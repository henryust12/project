/**
 * 
 */
package com.eden.ElonBookStore.controller;





import java.sql.Date;
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
		buy.setCrDate(null);
		buyService.saveBuy(buy);

		return "redirect:/cashier/booklist";
	}
	
	@RequestMapping("/booklist")
	private String getAllBooks(Model model) {
		List<Books> list = bookService.loadAllBooks();
		model.addAttribute("allBooks", list);
		return "CashierBookList";
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
