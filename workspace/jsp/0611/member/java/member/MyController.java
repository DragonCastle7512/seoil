package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my/*")
public class MyController extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//localhost:8888/my/add
		String[] url = req.getRequestURI().split("/");
		if(url.length < 2) return;
		String command = url[2];
		switch (command) {
			case "add": req.setAttribute("test", "test"); break;
			case "replace": req.setAttribute("test", "replace test"); break;
			case "remove": req.removeAttribute("test"); break;
		}
		System.out.println(req.getAttribute("test"));
	}
}
