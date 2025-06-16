package d0616_03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("d0616_03/setting.xml");
		Student stu = (Student)app.getBean("student");
		Print pr = (Print)app.getBean("print");
		pr.print();
	}
}
