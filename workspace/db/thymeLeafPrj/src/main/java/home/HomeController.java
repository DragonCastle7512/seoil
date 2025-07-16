package home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("HomeController");
	}
	@GetMapping("/")
	public String index(Model model) {
		System.out.println("/호출");
		model.addAttribute("message", "hello thymeleaf");
		return "index";
	}
}
