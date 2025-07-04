package hibernate;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		
		//1) �������� �ҷ�����
		StandardServiceRegistry standardServiceRegistry = 
				new StandardServiceRegistryBuilder()
				.configure("hibernate/hibernate.cfg.xml")
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
//			MemberEntity m = new MemberEntity();
//			m.setId("test"+i); m.setPassword("111"+i); session.save(m);
//		}
//		session.getTransaction().commit();
		 
		//��ü ���
//		List<MemberEntity> list = session.createCriteria(MemberEntity.class).list();
//		for(MemberEntity m : list) {
//			System.out.println(m);
//		}
		 
		//�������
//		MemberEntity m = session.load(MemberEntity.class, "test1");
//		System.out.println(m);
		 
		//����	
//		 MemberEntity m = session.load(MemberEntity.class, "test1"); 
//		if(m != null) {
//			m.setPassword("0000");
//		} 
//		session.getTransaction().commit();
//		System.out.println(session.load(MemberEntity.class, "test1"));
		 
		//����
//		MemberEntity m = session.load(MemberEntity.class, "test1"); 
//		if(m != null) {
//			session.delete(m);
//		}
//		session.getTransaction().commit();
//		System.out.println(session.createCriteria(MemberEntity.class).list());
		
		Query<MemberEntity> query = session.createNativeQuery("SELECT * FROM MemberEntity WHERE id = ?", MemberEntity.class);
		query.setString(1, "test2");
		List<MemberEntity> list = query.getResultList();
		System.out.println(list);
		
		session.close();
	}

}
