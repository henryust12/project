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
public class CashierController {
	@GetMapping("/cashierhome")
	public String cashierHome() {
		return "CashierHome";
	}
	
	
	@GetMapping("/cashierbooklist")
	public String cashierBookList() {
		return "CashierBookList";
	}
	
	@GetMapping("/cashierbuyhistory")
	public String cashierBuyHistory() {
		return "CashierBuyHistory";
	}
	
	@GetMapping("/buy")
	public String cashierBuy() {
		return "Buy";
	}
}
