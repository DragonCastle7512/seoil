package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import vo.Phonebook;

public class FrontController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("Phonebook Controller!!");
		ModelAndView mv = new ModelAndView();
		//model�� ������ �����͸� ������ ��ü
		mv.addObject("data", "1234");
		Phonebook pb = new Phonebook();
		pb.setId(1);
		pb.setName("��浿");
		pb.setHp("010-1111-1111");
		pb.setMemo("ģ��");
		mv.addObject("phonebook", pb);
		//view�� �����͸� �̿��Ͽ� ȭ���� ǥ���� ������
//		mv.setViewName("/WEB-INF/views/view.jsp");
		//viewResolver ����
		mv.setViewName("view");
		return mv;
	}

}
