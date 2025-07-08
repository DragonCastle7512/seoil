package board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("board")
public class BoardController {
	public BoardController() {
		System.out.println("board controller");
	}
	@RequestMapping("index")
	public String index() {
		return "/index";
	}
}
