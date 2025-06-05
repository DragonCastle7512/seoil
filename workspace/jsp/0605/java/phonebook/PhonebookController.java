package phonebook;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/")
public class PhonebookController extends HttpServlet {
	PhonebookService service;
	int result;
	public PhonebookController() {
		service = new PhonebookService();
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String page = "list";
		if(req.getRequestURI().split("/").length == 0) {
			resp.sendRedirect("/list");
			return;
		}
		switch (req.getRequestURI().split("/")[1]) {
			case "insertform":
				System.out.println("입력폼 요청");
				page = "insertform";
				break;
			case "insert":
				System.out.println("입력 처리");
				MultipartRequest multi = new MultipartRequest(
					req,
					"C:/work/workspace/Eclipse/phonebook_v2/src/main/webapp/img",
					5*1024*1024,
					"UTF-8",
					new DefaultFileRenamePolicy()
				);
				Enumeration<?> files = multi.getFileNames();
				String filename = (String)files.nextElement();
				result = service.insert(
					new Phonebook(0,
						multi.getParameter("name"), 
						multi.getParameter("hp"), 
						multi.getParameter("email"), 
						multi.getParameter("memo"),
						multi.getOriginalFileName(filename)
					)
				);
				req.setAttribute("state", "insert "+((result > 0) ? "success" : "fail"));
				page = "result";
				break;
			case "list":
				System.out.println("전체 출력");
				List<Phonebook> list = service.findAll();
				req.setAttribute("list", list);
				page = "list";
				break;
			case "view":
				System.out.println("선택 출력");
				req.setAttribute("pb", service.findById(Integer.parseInt(req.getParameter("id"))));
				page = "view";
				break;
			case "updateform":
				System.out.println("수정폼 요청");
				req.setAttribute("pb", service.findById(Integer.parseInt(req.getParameter("id"))));
				page = "updateform";
				break;
			case "update":
				System.out.println("수정 처리");
				MultipartRequest multi2 = new MultipartRequest(
					req,
					"C:/work/workspace/Eclipse/phonebook_v2/src/main/webapp/img",
					5*1024*1024,
					"UTF-8",
					new DefaultFileRenamePolicy()
				);
				Enumeration<?> files2 = multi2.getFileNames();
				String filename2 = (String)files2.nextElement();
				result = service.updateById(
					new Phonebook(
						Integer.parseInt(multi2.getParameter("id")),
						multi2.getParameter("name"), 
						multi2.getParameter("hp"), 
						multi2.getParameter("email"), 
						multi2.getParameter("memo"),
						multi2.getOriginalFileName(filename2)
					)
				);
				req.setAttribute("state", "update "+((result > 0) ? "success" : "fail"));
				page = "result";
				break;
			case "delete":
				System.out.println("삭제 처리");
				result = service.deleteById(Integer.parseInt(req.getParameter("id")));
				req.setAttribute("state", "delete "+((result > 0) ? "success" : "fail"));
				page = "result";
				break;
			default: 
				resp.sendRedirect("/list");
				break;
		}
		req.getRequestDispatcher("/WEB-INF/"+page+".jsp").forward(req, resp);
	}
}
