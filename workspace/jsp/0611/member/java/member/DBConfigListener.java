package member;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class DBConfigListener implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context = sce.getServletContext();
		
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String user = context.getInitParameter("user");
		String password = context.getInitParameter("password");
//		System.out.println(driver+" "+url+" "+user+" "+password);
		//new DBConfig(driver, url, user, password);
		//new DBConfig(sce.getServletContext());
		new MemberDAO(sce.getServletContext());
	}
}
