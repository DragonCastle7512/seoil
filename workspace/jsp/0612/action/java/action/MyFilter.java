package action;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class MyFilter extends HttpFilter{
	public MyFilter() {
		System.out.println("filter");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("filter init no param");
		super.init();
	}
	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("filter init param");
		super.init(config);
	}
	@Override
	protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter exec");
		System.out.println("filter"+req.getAttribute("firstfilter"));
		req.getServletContext();
		req.getSession();
		req.getCookies();
		super.doFilter(req, res, chain);
	}
}
