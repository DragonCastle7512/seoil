package reboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import reboard.service.ReboardService;

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
}
