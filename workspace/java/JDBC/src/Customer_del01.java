import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

public class Customer_del01 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521";
		String user = "night";
		String password = "night";
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		CustomerDAOImpl cdao = new CustomerDAOImpl();
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			Scanner sc = new Scanner(System.in);
			System.out.println(">>개인 정보 삭제<<");
			System.out.print("고객 정보 입력>> ");
			int cus_no = Integer.parseInt(sc.nextLine());
			
			CustomerDTO cusNo = cdao.getCusNo(cus_no);
			if(cusNo != null) {
				sql = "delete from customer where cus_no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, cus_no);
				int re = pstmt.executeUpdate();
				if(re == 1) System.out.println("삭제 성공");
			}
			else {
				System.out.println("고객 정보가 없습니다.");
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
