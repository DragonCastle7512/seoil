package board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	BoardService service;
	public BoardController() {
		System.out.println("board");
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "requestPage", defaultValue = "1") int requestPage, ModelAndView mv) {
		mv.addObject("pageList", service.pageList(requestPage));
		mv.setViewName("list");
		return mv;
	}
	@RequestMapping("writeform")
	public String writeform() {
		return "writeform";
	}
	@RequestMapping("write")
	public String write(BoardForm form) {
		return (service.save(form) > 0) ? "success" : "fail";
	}
	public ModelAndView view(int id) {
		return null;
	}
	public ModelAndView updateform(int id) {
		return null;
	}
	public String update(UpdateForm form) {
		return null;
	}
	public String delete(int id) {
		return null;
	}
}
