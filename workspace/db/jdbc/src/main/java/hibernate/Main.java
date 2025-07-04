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
		
		//1) 설정파일 불러오기
		StandardServiceRegistry standardServiceRegistry = 
				new StandardServiceRegistryBuilder()
				.configure("hibernate/hibernate.cfg.xml")
				.build();
		//2) 등록된 파일을 정보데이터에 저장
		Metadata metadata = new MetadataSources(standardServiceRegistry)
				.getMetadataBuilder()
				.build();
		//3) SessionFactory(bean의 집합)
		SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
				.build();
		
		//4) Session 획득
		Session session = sessionFactory.openSession();
		
		//5) 트랜젝션으로 처리(에러 발생 시 중단)
		session.beginTransaction();
		//5-2) sql문 실행
		//삽입
		
//		for (int i = 0; i < 50; i++) {
//			MemberEntity m = new MemberEntity();
//			m.setId("test"+i); m.setPassword("111"+i); session.save(m);
//		}
//		session.getTransaction().commit();
		 
		//전체 출력
//		List<MemberEntity> list = session.createCriteria(MemberEntity.class).list();
//		for(MemberEntity m : list) {
//			System.out.println(m);
//		}
		 
		//선택출력
//		MemberEntity m = session.load(MemberEntity.class, "test1");
//		System.out.println(m);
		 
		//수정	
//		 MemberEntity m = session.load(MemberEntity.class, "test1"); 
//		if(m != null) {
//			m.setPassword("0000");
//		} 
//		session.getTransaction().commit();
//		System.out.println(session.load(MemberEntity.class, "test1"));
		 
		//삭제
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
