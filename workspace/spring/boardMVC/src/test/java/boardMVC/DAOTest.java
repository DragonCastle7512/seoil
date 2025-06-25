package boardMVC;

import static org.junit.Assert.*;

import org.junit.Test;

import board.OracleBoardDAO;

public class DAOTest {

	@Test
	public void test() {
		OracleBoardDAO dao = new OracleBoardDAO();
		System.out.println(dao.count());
	}

}
