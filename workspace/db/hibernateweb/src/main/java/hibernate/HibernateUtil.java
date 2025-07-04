package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static final SessionFactory sessionFactory;
	public static final ThreadLocal<Session> sessions = new ThreadLocal<Session>();
	
	static {
		try {
			sessionFactory = new Configuration()
					.configure()
					.buildSessionFactory();	//hibernate 설정 파일 가져와서 세팅
		} catch (Throwable e) {
			System.out.println("sessionFactory fail");
			throw new ExceptionInInitializerError(e);
		}
	}
	
	//sessionFactory로 부터 하나의 세션을 얻는 작업
	public static Session getCurrentSession() throws HibernateException {
		Session s = sessions.get();
		if(s == null) {
			s = sessionFactory.openSession();
			sessions.set(s);
		}
		return s;
	}
	public static void closeSession() throws HibernateException {
		Session s = sessions.get();
		if(s != null) {
			s.close();
			sessions.set(null);
		}
	}
}
