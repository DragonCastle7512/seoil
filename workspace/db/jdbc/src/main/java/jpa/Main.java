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
		//1)�������� �ҷ�����(����ϱ�/Registry)
		StandardServiceRegistry standardServiceRegistry
		=new StandardServiceRegistryBuilder()
		.configure("jpa/hibernate.cfg.xml")
		.build();
		
		//2)��ϵ� ������ ���������Ϳ� ����(MetaData)
		Metadata metadata
		=new MetadataSources(standardServiceRegistry)
		.getMetadataBuilder()
		.build();
		
		//3)SessionFactory(���ἳ�� ����(bean�� ����))
		SessionFactory sessionFactory
		=metadata.getSessionFactoryBuilder().build();
		
		//4)3)���κ��� Sessionȹ��(����)
		Session session
		=sessionFactory.openSession();
		
		//5)Ʈ��������� ó��(�����۾��� ó���ϰ� �߰��� ������ �߻��ϸ� �ߴ�)
		session.beginTransaction();		
		session.close();
		
		StudentRepository jpa;
		jpa.findAll();
		jpa.findById(null);
		jpa.save(null);		//insert, update
		jpa.delete(null);
		jpa.count();
		jpa.findByName("ȫ�浿");
		*/
		
		/* JPA */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			/*
			//�߰�
			for (int i = 0; i < 10; i++) {
				Student s = new Student();
	            s.setSid("2025000"+i);
	            s.setName("ȫ�浿"+i);
	            s.setHp("010-1234-567"+(i%10));
	            em.persist(s);
			}
			*/
			//���� ���
            //System.out.println(em.find(Student.class, 2));
            
            //��ü ���
			//JPQL ���� select * from Student -> ����
            List<Student> students = em.createQuery(
            	    "SELECT s FROM Student s", Student.class)
            	    .getResultList();
            for (Student student : students)
				System.out.println(student);
            
            
            //����
			/*
            Student student = em.find(Student.class, 2);
            student.setHp("010-9999-8888");
            */
			
			//����
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
