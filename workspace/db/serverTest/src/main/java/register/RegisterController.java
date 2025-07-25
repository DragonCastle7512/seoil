package register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

	@Autowired
	RegisterService service;
	
	@GetMapping("/register")
	public void register() {}
	
	@PostMapping("/register")
	public String register(RegisterForm form) {
		service.save(form);
		return "redirect:/login/login";
	}
}
