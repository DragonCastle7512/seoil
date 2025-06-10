package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/")
public class MemberController extends HttpServlet {
	MemberService service;
	public MemberController() {
		System.out.println("MemberController 생성");
		service = new MemberService();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		String[] url = req.getRequestURI().split("/");
		if(url.length < 1) return;
		String command = url[1];
//		System.out.println(command);
		try {
			switch (command) {
				case "loginform": break;
				case "login":
					String id = req.getParameter("id");
					String password = req.getParameter("password");
					if(id == null || password == null) break;
					//일부 사용자만 사용할 경우
					/*
					if(id.equals("admin") && password.equals("1234")) {
						req.getSession().setAttribute("id", id);
						command = "result";
					}
					else {
						req.setAttribute("corr", "fail"); 
						command = "loginform";
					}*/
					//여러회원에 대한 로그인 처리를 할 경우(db)
					if(service.loginconfirm(id, password)) {
						
					}
					break;
				case "logout":
					resp.sendRedirect("loginform");
					req.getSession().invalidate();
					return;
				case "createMemberForm":
					break;
				case "createMember":
					Member member = new Member(
						req.getParameter("id"),
						req.getParameter("password"),
						req.getParameter("hp"),
						req.getParameter("email"),
						req.getParameter("address"),
						req.getParameter("pic")
					);
					int result = service.save(member);
					req.setAttribute("state", (result > 0) ? "success" : "fail");
					command = "memberResult";
					break;
				default: command = null; break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(command != null) {
			req.getRequestDispatcher("/WEB-INF/"+command+".jsp").forward(req, resp);
		}
	}
 }