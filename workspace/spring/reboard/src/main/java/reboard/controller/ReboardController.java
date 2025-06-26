package reboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import reboard.service.ReboardService;
import reboard.vo.BoardForm;
import reboard.vo.ReplyBoardForm;

@Controller
@RequestMapping("/reboard")
public class ReboardController {
	
//	@Autowired(required = true)
	@Autowired
	ReboardService service;
	
	@RequestMapping({"/", "/list"})
	//reboard/list -> reboard/list?requestPage=1
	public ModelAndView list(@RequestParam(defaultValue = "1") int requestPage, ModelAndView mv) {
		mv.addObject("page", service.getPageList(requestPage));
		mv.setViewName("list");
		return mv;
	}
	@RequestMapping("writeform")
	public String writeform() {
		return "writeform";
	}
	//form °´Ã¼´Â @ModelAttribute
	@RequestMapping("/write")
	public String write(@ModelAttribute BoardForm form, @RequestParam("attachment") MultipartFile file) {
		service.write(form, file);
		return "redirect:/reboard/list";
	}
	@RequestMapping("/view")
	public ModelAndView view(int id, ModelAndView mv) {
		mv.addObject("page", service.getViewPage(id));
		mv.setViewName("view");
		return mv;
	}
	@GetMapping("/reply")
	public String reply(@RequestParam(name = "id") int parentid, Model model) {
		model.addAttribute("parentid", parentid);
		model.addAttribute("title", service.getViewPage(parentid).getTitle());
		model.addAttribute("tab", service.getViewPage(parentid).getTab());
		return "reply";
	}
	@PostMapping("/reply")
	public String reply(@ModelAttribute ReplyBoardForm form, @RequestParam("attachment") MultipartFile file) {
		service.replySave(form, file);
		return "redirect:/reboard/list";
	}
	@RequestMapping("/updateform")
	public ModelAndView updateform(int id, ModelAndView mv) {
		mv.addObject("page", service.getViewPage(id));
		mv.setViewName("updateform");
		return mv;
	}
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardForm form, @RequestParam("attachment") MultipartFile file) {
		service.update(form, file);
		return "redirect:/reboard/list";
	}
	@RequestMapping("/delete")
	public String delete(int id) {
		service.delete(id);
		return "redirect:/reboard/list";
	}
	@RequestMapping("img")
	public String img() {
		return "img";
	}
}
