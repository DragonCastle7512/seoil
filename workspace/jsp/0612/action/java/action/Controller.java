package action;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class Controller extends HttpServlet {
	public Controller() {
		System.out.println("controller");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("servlet init no param");
		super.init();
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet init param");
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service exec");
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Get(select)");
		//super.doGet(req, resp);
		resp.getWriter().write("get call");
		resp.getWriter().flush();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post(insert)");
		//super.doPost(req, resp);
		resp.getWriter().write("post call");
		resp.getWriter().flush();
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Put(update)");
		//super.doPut(req, resp);
		resp.getWriter().write("put");
		resp.getWriter().flush();
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Delete(delete)");
		//super.doDelete(req, resp);
		resp.getWriter().write("delete call");
		resp.getWriter().flush();
	}
}
