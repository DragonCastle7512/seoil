package d0617_03;

import org.springframework.stereotype.Repository;

@Repository
public class DAO {
	public DAO() {
		System.out.println("DAO ����");
	}

	public void exec() {
		System.out.println("DAO exec()");
	}
}
