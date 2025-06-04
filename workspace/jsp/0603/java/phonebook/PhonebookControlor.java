package phonebook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.net.aso.p;

@WebServlet("/phonebook/*")
public class PhonebookControlor extends HttpServlet {
	PhonebookDAO dao = new PhonebookDAOOracle();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//http://localhost:8888/phonebook/insert
		//http://localhost:8888/phonebook/list
		//http://localhost:8888/phonebook/view
		//http://localhost:8888/phonebook/update
		//http://localhost:8888/phonebook/delete
		String command = req.getRequestURI();
		System.out.println("command:"+command);
		String[] commands = command.split("/");
		System.out.println(commands[0]);
		System.out.println(commands[1]);
		System.out.println(commands[2]);
		//url 요청 -> url 해석 -> 데이터 요청(dao) -> 저장(setAttribute) -> 보냄(jsp)
		int id, result;
		Phonebook pb;
		String name = "";
		String hp = "";
		String email = "";
		String memo = "";
		switch (commands[2]) {
			case "insert":
				name = req.getParameter("name");
				hp = req.getParameter("hp");
				email = req.getParameter("email");
				memo = req.getParameter("memo");
				//System.out.println(name+hp+email+memo);
				result = dao.insert(new Phonebook(0, name, hp, email, memo));
				req.setAttribute("state", "insert "+((result > 0) ? "success" : "fail"));
				req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
				break;
			case "list":
				List<Phonebook> list = dao.findAll();
				req.setAttribute("list", list);
				req.getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);
				break;
			case "view": 
				id = Integer.parseInt(req.getParameter("id"));
				pb = dao.findById(id);
				req.setAttribute("pb", pb);
				req.getRequestDispatcher("/WEB-INF/view.jsp").forward(req, resp);
				break;
			case "updateform":
				id = Integer.parseInt(req.getParameter("id"));
				pb = dao.findById(id);
				req.setAttribute("pb", pb);
				req.getRequestDispatcher("/WEB-INF/updateform.jsp").forward(req, resp);
				break;
			case "update": 
				id = Integer.parseInt(req.getParameter("id"));
				name = req.getParameter("name");
				hp = req.getParameter("hp");
				email = req.getParameter("email");
				memo = req.getParameter("memo");
				result = dao.updateById(new Phonebook(id, name, hp, email, memo));
				req.setAttribute("state", "update "+((result > 0) ? "success" : "fail"));
				req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
				break;
			case "delete":
				id = Integer.parseInt(req.getParameter("id"));
				result = dao.deleteById(id);
				req.setAttribute("state", "delete "+((result > 0) ? "success" : "fail"));
				req.getRequestDispatcher("/WEB-INF/result.jsp").forward(req, resp);
				break;
		}
		
	}
}
