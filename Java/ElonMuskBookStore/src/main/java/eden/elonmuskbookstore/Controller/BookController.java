package eden.elonmuskbookstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    
    @RequestMapping("/book")
    public String book(Model model){
        return "BookList";
    }
}
