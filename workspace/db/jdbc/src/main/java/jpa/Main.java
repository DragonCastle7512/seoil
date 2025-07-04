package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Main {
	
	public static void main(String[] args) {
		/* hibernate
		//1)설정파일 불러오기(등록하기/Registry)
		StandardServiceRegistry standardServiceRegistry
		=new StandardServiceRegistryBuilder()
		.configure("jpa/hibernate.cfg.xml")
		.build();
		
		//2)등록된 파일을 정보데이터에 저장(MetaData)
		Metadata metadata
		=new MetadataSources(standardServiceRegistry)
		.getMetadataBuilder()
		.build();
		
		//3)SessionFactory(연결설정 공장(bean의 집합))
		SessionFactory sessionFactory
		=metadata.getSessionFactoryBuilder().build();
		
		//4)3)으로부터 Session획득(연결)
		Session session
		=sessionFactory.openSession();
		
		//5)트랜잭션으로 처리(여러작업을 처리하고 중간에 에러가 발생하면 중단)
		session.beginTransaction();		
		session.close();
		
		StudentRepository jpa;
		jpa.findAll();
		jpa.findById(null);
		jpa.save(null);		//insert, update
		jpa.delete(null);
		jpa.count();
		jpa.findByName("홍길동");
		*/
		
		/* JPA */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			/*
			//추가
			for (int i = 0; i < 10; i++) {
				Student s = new Student();
	            s.setSid("2025000"+i);
	            s.setName("홍길동"+i);
	            s.setHp("010-1234-567"+(i%10));
	            em.persist(s);
			}
			*/
			//선택 출력
            //System.out.println(em.find(Student.class, 2));
            
            //전체 출력
			//JPQL 문법 select * from Student -> 에러
            List<Student> students = em.createQuery(
            	    "SELECT s FROM Student s", Student.class)
            	    .getResultList();
            for (Student student : students)
				System.out.println(student);
            
            
            //수정
			/*
            Student student = em.find(Student.class, 2);
            student.setHp("010-9999-8888");
            */
			
			//삭제
            /*
			Student student = em.find(Student.class, 2);
			em.remove(student);
			*/
			tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
	}
}
