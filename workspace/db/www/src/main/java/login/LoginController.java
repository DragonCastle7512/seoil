package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/login")
public class LoginController {
	public LoginController() {
		System.out.println("Login controller");
	}
	@RequestMapping("index")
	public String index() {
		return "/index";
	}
}
