package d0617_03_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("d0617_03_practice/setting.xml");
		Controller controller = (Controller)app.getBean("controller");
		controller.exec();
	}
}
