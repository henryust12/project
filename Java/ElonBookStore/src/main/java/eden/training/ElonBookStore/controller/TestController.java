/**
 * 
 */
package eden.training.ElonBookStore.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import eden.training.ElonBookStore.bean.UserBean;

import eden.training.ElonBookStore.service.GenreRepository;
import eden.training.ElonBookStore.service.GenreService;
/**
 * @author shima
 *
 */
import eden.training.ElonBookStore.dto.UserDto;

@Controller
public class TestController {
	@Autowired
	private GenreRepository GenreRepository;
	
	
	@RequestMapping("/test")
	public String chk(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		List<UserDto> listDto = new ArrayList<UserDto>();

		UserDto u = new UserDto();
		u.setUserId("henry");
		u.setFirstName("hendri");
		u.setFirstNameKana("ヘンドリ");
		u.setLastName("Simarmata");
		u.setLastNameKana("シマルマタ");
		u.setSex('男');
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String format = formatter.format(date);
		u.setBirthday(format);
		u.setUserLevel('1');
		u.setPassword("dtoPASSWORD");
		listDto.add(u);
		
		
		u=new UserDto();
		u.setUserId("1111");
		u.setFirstName("endo");
		u.setFirstNameKana("エンド");
		u.setLastName("guna");
		u.setLastNameKana("グナ");
		u.setSex('女');
		date = new Date();
		formatter = new SimpleDateFormat("yyyy-MM-dd");
		format = formatter.format(date);
		u.setBirthday(format);
		u.setUserLevel('2');
		u.setPassword("newpassword");
		listDto.add(u);
		
		model.addAttribute("ld",listDto);

		return "test";
	}
	

}
