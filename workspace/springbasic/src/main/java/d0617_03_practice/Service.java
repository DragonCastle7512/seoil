package d0617_03_practice;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private DAO dao;
	public Service() {
		System.out.println("Service »ý¼º");
	}
	public void exec() {
		System.out.println("Service exec()");
		dao.exec();
	}

}
