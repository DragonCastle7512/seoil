/*package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Controller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fileName = req.getRequestURI().split("/")[1];
		try {
			switch (fileName) {
			case "login":
				break;
			case "login_proc":
				String id = req.getParameter("id"); 
				String password = req.getParameter("password");
				System.out.println(id+" "+password);
				if(id.equals("admin") && password.equals("1234")) {
					req.setAttribute("id", id);
					req.setAttribute("password", password);
					req.setAttribute("success", "success");
					req.getSession().setAttribute("id", id);
					req.getServletContext().setAttribute("id", id);
					System.out.println("로그인 성공!!");
					fileName = "result";
				} else  {
					System.out.println("로그인 실패!!");
				}
				break;
			case "logout":
				req.getSession().invalidate();
				fileName = "login";
				break;
			case "result":
				break;
			default:
				fileName = "null";
				break;
			}
		} catch (Exception e) {
			fileName = "null";
			e.printStackTrace();
		}
		if(fileName != "null") {
			//req.getRequestDispatcher("/WEB-INF/"+fileName+".jsp").forward(req, resp);
			resp.sendRedirect(fileName);
		}
		
	}
}*/