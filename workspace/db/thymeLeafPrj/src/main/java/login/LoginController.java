package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("login") xeb.xml설정에서 매핑주소가 /login/* 처리 + login-servlet.xml이 beans:beans이므로 자동매핑
public class LoginController {
	public LoginController() {
		System.out.println("LoginCotroller");
	}
	
	@GetMapping("/login")
	public void login() {}
}