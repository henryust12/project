/**
 * 
 */
package eden.training.ElonBookStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import eden.training.ElonBookStore.bean.UserBean;
/**
 * @author shima
 *
 */

@Controller
public class TestController {
	@GetMapping("/test")
	public String chk() {
		UserBean ub = new UserBean();
		
		return "";
	}
	

}
