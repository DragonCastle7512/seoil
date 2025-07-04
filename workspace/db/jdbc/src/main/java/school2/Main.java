package school2;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		// ���̹�����Ʈ :JPA
		//���� �����ͺ��̽������� ���̺� ���������.
		//���̹�����Ʈ�� ���̺��� ��ü�� �����ϸ� �ڵ����� ����(@Entity)
		//hibernate.cfg.xml : db����, ���̺� �������Ͽ���(member.xml)
		//member.xml :  ���̺� ����
		
		//1)�������� �ҷ�����(����ϱ�/Registry)
		StandardServiceRegistry standardServiceRegistry
		=new StandardServiceRegistryBuilder()
		.configure("school2/hibernate.cfg.xml")
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
		//Transaction tx=session.beginTransaction();
		//6)main�Լ��� ����(���̺��� �ڵ����� �����ǰ� ��)
		//7)sql���� �����ϰ� �˴ϴ�.(sql�� ���� �Է�, ���, ����, ������ ����)
		//�Է�
		
		Student student=new Student();
		student.setSid("25010122");
		student.setName("ȫ�浿2");
		student.setHp("010-1111-2222");
		session.save(student);
		session.getTransaction().commit(); //tx.commit();		
		
		/*
		for(int i=1;i<50;i++) {
			MemberEntity member=new MemberEntity();
			member.setId("test"+i);
			member.setPassword("111"+i);
			session.save(member);
		}
		session.getTransaction().commit();

		*/
		
		//��ü���
		/*
		List<MemberEntity> list=session
				.createCriteria(MemberEntity.class).list();
		
		for(MemberEntity member:list) {
			System.out.println(member);
		}
		System.out.println(list);		
		*/
		
		//�������
		/*
		MemberEntity member=new MemberEntity();
		member=session.load(MemberEntity.class,"test1");
		System.out.println(member);
		*/
		
		//����, ������ �̹� ����� ������ �����ϴ� ����
		//session.get�Լ��� ���ؼ� �����͸� ȹ��, ȹ���� ��ü�� set�Լ��� ����
		/*
		MemberEntity member=session.get(MemberEntity.class, "test1");
		if(member!=null) {
			member.setPassword("0000");
		}
		session.getTransaction().commit();
		System.out.println(session.load(MemberEntity.class,"test1"));
		*/
		
		//����
		/*
		Student member=session.get(Student.class, "test1");
		if(member!=null) {
			session.delete(member);
		}
		session.getTransaction().commit();
		System.out.println(session
				.createCriteria(Student.class).list());
		*/
		
		
		
		//�ǵ�������		
		session.close();
	}

}