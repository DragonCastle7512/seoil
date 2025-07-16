package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("member")
public class MemberController {
	public MemberController() {
		System.out.println("MemberController=======================");
	}
	
	@Autowired
	MemberService service;
	
	@GetMapping("register")
	public void getRegister() {
		System.out.println("register===================================");
	} //WEB-INF/member/register.html
	
	@PostMapping("register")
	public String register(RegisterForm form) {
		service.save(form);
		return "redirect:/login/login";
	}
}
