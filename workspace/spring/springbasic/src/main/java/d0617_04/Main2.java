package d0617_04;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main2 {
	private static final Logger LOG = Logger.getLogger(d0617_04.Main1.class.getName());
	public static void main(String[] args) {
		try {
			FileHandler handler = new FileHandler("app.log");
			handler.setFormatter(new SimpleFormatter());
			LOG.addHandler(handler);
			LOG.info("info 로그");
			LOG.warning("warnning 로그");
			int result = 1/0;
		} catch (Exception e) {
			LOG.severe("severe 로그");
		}
	}
}
