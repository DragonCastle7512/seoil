package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String password = "1111";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
		} catch (Exception e) {}
		
	}
}
