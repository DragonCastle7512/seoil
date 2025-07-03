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
		
		//1) 설정파일 불러오기
		StandardServiceRegistry standardServiceRegistry = 
				new StandardServiceRegistryBuilder()
				.configure("school/hibernate.cfg.xml")
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
//			Student stu = new Student();
//			stu.setId(i);
//			stu.setSid("2025"+i);
//			stu.setName("홍길동"+i);
//			stu.setHp("010-1111-1111");
//			session.save(stu);
//		}
//		session.getTransaction().commit();
		 
		//전체 출력
//		List<Student> list = session.createCriteria(Student.class).list();
//		for(Student stu : list) {
//			System.out.println(stu);
//		}
		 
		//선택출력
//		Student stu = session.load(Student.class, 1);
//		System.out.println(stu);
		 
		//수정	
//		Student stu = session.load(Student.class, 1); 
//		if(stu != null) {
//			stu.setName("hong1");
//			stu.setHp("010-2222-2222");
//		} 
//		session.getTransaction().commit();
//		System.out.println(session.load(Student.class, 1));
		 
		//삭제
		Student stu = session.load(Student.class, 3); 
		if(stu != null) {
			session.delete(stu);
		}
		session.getTransaction().commit();
		System.out.println(session.createCriteria(Student.class).list());
		
		
		session.close();
	}

}
