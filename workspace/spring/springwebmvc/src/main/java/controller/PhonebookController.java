package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.PhonebookService;
import vo.Phonebook;

@Controller
@RequestMapping("/phonebook")
public class PhonebookController {
	
	@Autowired
	PhonebookService service;
	public PhonebookController() {
		System.out.println("phonebook controller");
	}
//	@RequestMapping("/phonebook/save")
	@RequestMapping("save")
	public String save() {
		return "save";
	}
	@RequestMapping("insertform")
	public String insertForm() {
		return "insertform";
	}
//	@RequestMapping("insert")
//	public String insert(String name, String hp, String email, String memo) {
//		System.out.println(name);
//		return "insert";
//	}
	@RequestMapping("insert")
	public String insert(Phonebook pb) {
		int result = service.save(pb);
		return (result > 0) ? "success" : "error";
	}
	@RequestMapping("list")
	public String list() {
		return "list";
	}
	@RequestMapping("view")
	public String view() {
		return "view";
	}
	@RequestMapping("updateform")
	public String updateForm() {
		return "updateForm";
	}
	@RequestMapping("update")
	public String update() {
		return "update";
	}
	@RequestMapping("delete")
	public String delete() {
		return "delete";
	}
}