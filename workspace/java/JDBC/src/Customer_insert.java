import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Customer_insert {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521";
		String user = "night";
		String password = "night";
		Connection con = null;
		PreparedStatement pt = null;
		String sql = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			Scanner sc = new Scanner(System.in);
			System.out.println("##### Customer 테이블에 레코드 저장 #####");
			System.out.print("고객 이름>> ");
			String cus_name = sc.nextLine();
			System.out.println("고객 폰번호>> ");
			String cus_phone = sc.nextLine();
			System.out.println("고객 이메일>> ");
			String cus_email = sc.nextLine();
			
			sql = "insert into customer (cus_no, cus_name, cus_phone, cus_email, cus_date) values(cus_seq.nextval,"+"?,?,?,sysdate)";
			pt = con.prepareStatement(sql);
			pt.setString(1, cus_name);
			pt.setString(2, cus_phone);
			pt.setString(3, cus_email);
			int re = pt.executeUpdate();
			if(re == 1) {
				System.out.println("성공");
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
	}

}
