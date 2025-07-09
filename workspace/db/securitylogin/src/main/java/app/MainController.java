package app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/all")
public class MainController {
	
	@RequestMapping("index")
	public String index() {
		return "all";
	}
	
	@RequestMapping("403")
	public String error403() {
		return "403";
	}
	
	@RequestMapping("404")
	public String error404() {
		return "404";
	}
	
}
