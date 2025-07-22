package restapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("index2")
	public String index2() {
		return "index2";
	}
	@GetMapping("index3")
	public String index3() {
		return "index3";
	}
}
