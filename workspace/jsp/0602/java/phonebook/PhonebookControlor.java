package phonebook;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/phonebook/*")
public class PhonebookControlor extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		switch (commands[2]) {
			case "insert": break;
			case "list":
				PhonebookDAOH2 dao = new PhonebookDAOH2();
				List<Phonebook> list = dao.findAll();
				req.setAttribute("list", list);
				req.getRequestDispatcher("/WEB-INF/list3.jsp").forward(req, resp);
			case "view": break;
			case "update": break;
		}
		
	}
}
