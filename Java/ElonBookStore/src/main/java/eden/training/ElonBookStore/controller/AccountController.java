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
public class AccountController {
	@GetMapping("/accountdetails")
	public String accountDetail() {
		return "AccountDetail";
	}

}
