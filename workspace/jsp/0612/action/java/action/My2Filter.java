package action;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class My2Filter extends HttpFilter {
	public My2Filter() {
		System.out.println("filter2");
	}
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter2 exec");
		req.setAttribute("firstfilter", "firstfilter save");
		super.doFilter(req, res, chain);	//다음 필터로 연결
	}
}
