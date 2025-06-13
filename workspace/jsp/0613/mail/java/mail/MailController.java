package mail;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mail/*")
public class MailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MailController() {
    	
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;encoding=utf-8");
		switch (request.getRequestURI()) {
			case "/mail/sendmailform":
				request.getRequestDispatcher("/WEB-INF/sendemail.jsp").forward(request, response); 
				break;
			case "/mail/sendmail":
				MailData data = new MailData(
					request.getParameter("recvemail"),
					request.getParameter("subject"),
					request.getParameter("content")
				);
//				new MyEmail().sendMail(data);
				String msg = "성공";
				msg = (MyEmail.getInstance().sendMail(data)) ? "성공" : "실패";
				response.getWriter().write("<script>alert('메일발송'"+msg+"');"
						+ "location.href='/mail/sendmailform'</script>");
				response.getWriter().flush();
				break;
		}
	}
}
