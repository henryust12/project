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
public class UserController {
	@GetMapping("/userlist")
	public String userList() {
		return "UserList";
	}
	
	@GetMapping("/userupdate")
	public String userUpdate() {
		return "UserUpdate";
	}
	
	@GetMapping("/userentry")
	public String userEntry() {
		return "UserEntry";
	}
	
	@GetMapping("/userdelete")
	public String userDelete() {
		return "deleted";
	}
	
	@GetMapping("/logout")
	public String userLogout() {
		return "Home";
	}

}
