package page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	@GetMapping("/admin/index")
	public String adminIndex() {
		return "admin/index";
	}
	
	@GetMapping("/user/index")
	public String userIndex() {
		return "user/index";
	}
}
