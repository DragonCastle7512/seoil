package d0616_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("d0616_01/setting.xml");
		
		/*
		Student s1 = (Student)app.getBean("student");
		s1.setId(100);
		s1.setName("kim");
		Sungjuk sungjuk1 = new Sungjuk(90, 90, 90);
		Sungjuk sungjuk1 = (Sungjuk)app.getBean("sungjuk");
		s1.setSunjuk(sungjuk1);
		System.out.println(s1.toString());
		*/
		
		/*
		Sungjuk sungjuk;
		Student s2 = new Student(1, "hongkildong", sungjuk);
		System.out.println(s2.toString());
		*/
		
		//���������� ����Ϸ��� ��ü�� student
		//������ �л��ȿ� ���Ե� �����̹Ƿ� ���� ���� -> �л��� �����ؾ���
		Student student = (Student)app.getBean("student");
		System.out.println(student.toString());
	}
}
