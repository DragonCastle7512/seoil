package contacts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import contacts.service.ContactsService;
import contacts.vo.Contact;

@RequestMapping("/contacts")
@Controller
public class ContactsController {
	
	@Autowired
	ContactsService service;
	
	@RequestMapping("")
	public ModelAndView list(@RequestParam(defaultValue = "1") int requestPage, ModelAndView mv) {
		mv.addObject("page", service.viewAll(requestPage));
		mv.setViewName("list");
		return mv;
	}
	
	@GetMapping("/")
	public ModelAndView view(@RequestParam(name = "id") int id, ModelAndView mv) {
		mv.addObject("con", service.view(id));
		mv.setViewName("view");
		return mv;
	}
	
	@GetMapping("/new")
	public String insertForm() {
		return "insertform";
	}
	
	@PostMapping("/newProc")
	public String insert(Contact con) {
		service.save(con);
		return "redirect:/contacts";
	}
	
	@GetMapping("/edit")
	public ModelAndView edit(int id, ModelAndView mv) {
		mv.addObject("con", service.view(id));
		mv.setViewName("editform");
		return mv;
	}
	
	@PostMapping("/editProc")
	public String editProc(Contact con) {
		service.edit(con);
		return "redirect:/contacts";
	}
	
	@GetMapping("/delete")
	public String delete(int id) {
		service.delete(id);
		return "redirect:/contacts";
	}
}
