package member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("member")
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@GetMapping("register")
	public void getRegister() {} //WEB-INF/member/register.jsp
	
	@PostMapping("register")
	public void register(RegisterForm form) {
		service.save(form);
	}
}
