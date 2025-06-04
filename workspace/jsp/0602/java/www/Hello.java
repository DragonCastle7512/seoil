package www;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("/hello url접속");
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head meta charset=\"UTF-8\"></head>");
		out.print("<body>");
		out.print("<h1>hello url에 접속하였습니다</h1>");
		//hello?insa=안녕 (insa=안녕은 파라메타, 전달 정보)
		
		String p1 = request.getParameter("insa");
		System.out.println(p1);
		int p2 = Integer.parseInt(request.getParameter("re"));
		for(int i=0; i<p2; i++) out.print(p1+"<br>");	//문자열 처리
		out.print("</body>");
		out.print("</html>");
	}
}
