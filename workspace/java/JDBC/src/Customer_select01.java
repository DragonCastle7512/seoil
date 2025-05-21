import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Customer_select01 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521";
		String user = "night";
		String password = "night";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			sql = "select * from customer order by cus_no desc";
			rs = stmt.executeQuery(sql);
			
			System.out.println(">>>>>>>>>>>>>고객 목록 보기<<<<<<<<<<<<<");
			System.out.println("고객번호 \t 고객이름 \t 고객폰번호 \t 고객이메일");
			System.out.println("====================================");
			while(rs.next()) {
				int cur_no = rs.getInt(1);
				String cus_name = rs.getString("cus_name");
				String cus_phone = rs.getString("cus_phone");
				String cus_email = rs.getString("cus_email");
				String cus_date = rs.getString("cus_date");
				System.out.println(cur_no+"\t"+cus_name+"\t"+cus_phone+"\t"+cus_email+"\t"+cus_date);
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}		
	}

}
