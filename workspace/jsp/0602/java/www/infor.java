package www;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class infor extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("header");
		Enumeration<String> headers = req.getHeaderNames();
		while (headers.hasMoreElements()) {
			String key = headers.nextElement();
			String value = req.getHeader(key);
			System.out.println(key+" "+value);
		}
		System.out.println("body");
		//현재 전달되는 내용이 없음
		InputStream in = req.getInputStream();
		int c=0;
		while((c = in.read()) != -1) {
			System.out.println((char)c);
		}
		System.out.println("전송되는 header에서 클라이언트 PC의 정보획득!");
		System.out.println(req.getRemoteAddr());
		System.out.println(req.getRemoteHost());
		System.out.println(req.getRemotePort());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		System.out.println(req.getServletPath());
		System.out.println(req.getRealPath(getServletInfo()));
		
	}
}
