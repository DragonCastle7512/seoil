package antationmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	public MainController() {
		System.out.println("Controller");
	}
	
	@RequestMapping
	public String index() {
		return "index";
	}
}
