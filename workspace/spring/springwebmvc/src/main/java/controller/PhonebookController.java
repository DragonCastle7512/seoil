package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
//	@RequestMapping("insertform")
//	public String insertForm() {
//		return "insertform";
//	}
	//저장할 모델이 없을 경우 void형으로 처리하며,
	//url을 기준으로 폴더를 만들고, url관련 jsp를 생성한다.
	@RequestMapping("insertform")
	public void insertForm() {
		return;
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
	public ModelAndView list() {
		List<Phonebook> list = service.list();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("list");
		return mv;
	}
	@RequestMapping("view")
	public ModelAndView view(@RequestParam(name = "id") int id, ModelAndView mv) {
		mv.addObject("pb", service.findById(id));
		mv.setViewName("view");
		return mv;
	}
	@RequestMapping("updateform")
	public ModelAndView updateForm(int id, ModelAndView mv) {
		mv.addObject("pb", service.findById(id));
		mv.setViewName("phonebook/updateform");
		return mv;
		//return 값이 없을 경우 view는 /WEB-INF/views/url의 패턴+.jsp
		//ModelAndView를 만들고, 리턴하지 않으면, 페이지에 적용할 수 없음
	}
	@RequestMapping("update")
	public String update(Phonebook pb) {
		int result = service.update(pb);
		//오류 발생 시 프로그램 종료
		if(result < 1) throw new CustomerException();
		return "updateSuccess";
	}
	@RequestMapping("delete")
	public String delete(int id) {
		int result = service.delete(id);
		//오류 발생 시 프로그램 종료
		if(result < 1) throw new CustomerException();
		return "deleteSuccess";
	}
}