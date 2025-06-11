package action;

import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;

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
}
