package d0617_04;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main3 {
	private static final Logger LOG = Logger.getLogger(d0617_04.Main1.class.getName());
	public static void main(String[] args) {
		try {
			FileHandler handler = new FileHandler("login.log", true);
			handler.setFormatter(new SimpleFormatter());
			LOG.addHandler(handler);
			String id = "admin";
			String pwd = "1234";
			if(id.equals("admin") && pwd.equals("1234"))
				LOG.info("login success");
			else
				LOG.warning("login fail:"+id+","+pwd);
		} catch (Exception e) {
			LOG.severe(e.getMessage());
		}
	}
}
