package d0617_03_practice;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	private Service service;
	public Controller() {
		System.out.println("Controller »ý¼º");
	}
	public void exec() {
		System.out.println("Controller exec()");
		service.exec();
	}

}
