package board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/board")
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
	@RequestMapping("view")
	public ModelAndView view(int id, ModelAndView mv) {
		mv.addObject("page", service.viewPage(id));
		System.out.println(service.viewPage(id));
		mv.setViewName("view");
		return mv;
	}
	@RequestMapping("updateform")
	public ModelAndView updateform(int id, ModelAndView mv) {
		mv.addObject("page", service.viewPage(id));
		mv.setViewName("updateform");
		return mv;
	}
	@RequestMapping("update")
	public String update(UpdateForm form) {
		return (service.update(form) > 0) ? "successUpdate" : "failUpdate";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		return (service.delete(id) > 0) ? "successUpdate" : "failUpdate";
	}
}
