package procedure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String password = "1111";
			Connection con = DriverManager.getConnection(url, user, password);
//			PreparedStatement ps = con.prepareStatement("{call test_insert(?,?)}");
			PreparedStatement ps = con.prepareCall("test_insert(?,?)");
			ps.setInt(1, 6);
			ps.setString(2, "�ڱ浿");
			ps.execute();
			ps.close();
			con.close();
			
		} catch (Exception e) {}
	}

}
