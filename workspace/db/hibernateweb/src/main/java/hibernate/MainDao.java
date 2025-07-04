package hibernate;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository
public class MainDao {
	//db ���� ���� ��ü ���� -> hibernate������ ������ �������� �ʰ� ó��
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
