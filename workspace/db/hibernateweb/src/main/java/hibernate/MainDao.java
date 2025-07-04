package hibernate;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository
public class MainDao {
	//db 접속 관련 객체 생성 -> hibernate에서는 병도로 생성하지 않고 처리
	public MainDao() {
		//Session session = HibernateUtil.getCurrentSession();
		//System.out.println("===============session=============\n"+session);
	}

	public int insert(Student student) {
		Session session = HibernateUtil.getCurrentSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		HibernateUtil.closeSession();
		return 0;
	}
	
}
