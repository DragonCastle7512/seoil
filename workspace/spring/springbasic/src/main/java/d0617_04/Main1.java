package d0617_04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main1 {
	private static final Logger LOG = Logger.getLogger(d0617_04.Main1.class.getName());
	public static void main(String[] args) {
		System.out.println(LOG);
		//log�� �⺻ �ܰ�: info(��������), warnning(����), severe(�ɰ�)
		LOG.info("�������� �α�");
		LOG.warning("��� �α�");
		LOG.severe("�ɰ� �α�");
		
		System.out.println("----------------------");
		LOG.setLevel(Level.SEVERE);
		LOG.info("�������� �α�");
		LOG.warning("��� �α�");
		LOG.severe("�ɰ� �α�");
		
	}
}
