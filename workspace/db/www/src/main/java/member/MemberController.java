package member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/member")
public class MemberController {
	public MemberController() {
		System.out.println("member controller");
	}
	@RequestMapping("index")
	public String index() {
		return "/index";
	}
}
