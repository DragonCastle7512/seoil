package school;


import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import hibernate.MemberEntity;

public class Main {

	public static void main(String[] args) {
		
		//1) �������� �ҷ�����
		StandardServiceRegistry standardServiceRegistry = 
				new StandardServiceRegistryBuilder()
				.configure("school/hibernate.cfg.xml")
				.build();
		//2) ��ϵ� ������ ���������Ϳ� ����
		Metadata metadata = new MetadataSources(standardServiceRegistry)
				.getMetadataBuilder()
				.build();
		//3) SessionFactory(bean�� ����)
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
				.build();
		
		//4) Session ȹ��
		Session session = sessionFactory.openSession();
		
		//5) Ʈ���������� ó��(���� �߻� �� �ߴ�)
		session.beginTransaction();
		//5-2) sql�� ����
		
		//����
//		for (int i = 0; i < 50; i++) {
//			Student stu = new Student();
//			stu.setId(i);
//			stu.setSid("2025"+i);
//			stu.setName("ȫ�浿"+i);
//			stu.setHp("010-1111-1111");
//			session.save(stu);
//		}
//		session.getTransaction().commit();
		 
		//��ü ���
//		List<Student> list = session.createCriteria(Student.class).list();
//		for(Student stu : list) {
//			System.out.println(stu);
//		}
		 
		//�������
//		Student stu = session.load(Student.class, 1);
//		System.out.println(stu);
		 
		//����	
//		Student stu = session.load(Student.class, 1); 
//		if(stu != null) {
//			stu.setName("hong1");
//			stu.setHp("010-2222-2222");
//		} 
//		session.getTransaction().commit();
//		System.out.println(session.load(Student.class, 1));
		 
		//����
		Student stu = session.load(Student.class, 3); 
		if(stu != null) {
			session.delete(stu);
		}
		session.getTransaction().commit();
		System.out.println(session.createCriteria(Student.class).list());
		
		
		session.close();
	}

}
