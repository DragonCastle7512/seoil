package d0617_04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main1 {
	private static final Logger LOG = Logger.getLogger(d0617_04.Main1.class.getName());
	public static void main(String[] args) {
		System.out.println(LOG);
		//log의 기본 단계: info(정보제공), warnning(위험), severe(심각)
		LOG.info("정보제공 로그");
		LOG.warning("경고 로그");
		LOG.severe("심각 로그");
		
		System.out.println("----------------------");
		LOG.setLevel(Level.SEVERE);
		LOG.info("정보제공 로그");
		LOG.warning("경고 로그");
		LOG.severe("심각 로그");
		
	}
}
