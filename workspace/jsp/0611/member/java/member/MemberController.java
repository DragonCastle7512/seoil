package member;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/")
public class MemberController extends HttpServlet {
	
	MemberService service;
	public MemberController() {
		System.out.println("MemberController ����");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("no param init call");
		//�����Ķ���� ��ü�� Context��ü�� ����
		service = new MemberService(getServletContext());
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("param init call");
		//�ݵ�� ȣ��
		super.init(config);
		//���� �Ķ���͸� ���
		service = new MemberService(getServletContext());
//		System.out.println(config.getInitParameter("secretpassword"));
		//��ü �Ķ���͸� ���
		//service = new MemberService(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		String secretpassword = getServletConfig().getInitParameter("secretpassword");
//		System.out.println("***************");
//		System.out.println(secretpassword);
//		System.out.println(getServletContext().getInitParameter("driver"));
		
		//���ͷ� ó��
//		req.setCharacterEncoding("utf-8");
		
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
					//�Ϻ� ����ڸ� ����� ���
					/*
					if(id.equals("admin") && password.equals("1234")) {
						req.getSession().setAttribute("id", id);
						command = "result";
					}
					else {
						req.setAttribute("corr", "fail"); 
						command = "loginform";
					}*/
					//����ȸ���� ���� �α��� ó���� �� ���(db)
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