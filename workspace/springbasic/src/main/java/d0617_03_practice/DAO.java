package d0617_03_practice;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	public DAO() {
		System.out.println("DAO »ý¼º");
	}
	public void exec() {
		System.out.println("DAO exec()");
	}

}
