
import java.sql.*;
import java.util.Scanner;


public class Customer_Edit_01 {

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
			Scanner sc = new Scanner(System.in);
			System.out.println("고객 정보 수정");
			System.out.println("기준이 되는 고객 번호>>");
			int cus_no = Integer.parseInt(sc.nextLine());
			sql = "select cus_no from customer where cus_no="+cus_no;
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				System.out.println("이름>> ");
				String cus_name = sc.nextLine();
				System.out.println("폰번호>> ");
				String cus_phone = sc.nextLine();
				System.out.println("이메일");
				String cus_email = sc.nextLine();
				sql = "update customer set cus_name='"+cus_name+"', cus_phone='"+cus_phone+"', cus_email='"+cus_email
						+"' where cus_no="+cus_no;
				int re = stmt.executeUpdate(sql);
				if(re == 1) {
					System.out.println("성공");
				}
				else {
					System.out.println("실패");					
				}
			}
			
		} catch (Exception e) {e.printStackTrace();}
		finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
				} catch (Exception e) {e.printStackTrace();}
		}
	}

}
