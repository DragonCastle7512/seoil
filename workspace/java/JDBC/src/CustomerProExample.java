import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import net.daum.dao.CustomerDAOImpl;
import net.daum.dto.CustomerDTO;

public class CustomerProExample {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "night";
		String pwd = "night";
		
		CustomerDAOImpl cdao = new CustomerDAOImpl();
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		CallableStatement ct = null;
		String sql = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			System.out.println("##### 저장 프로시저 수행 실습 #####");
			System.out.print("고객 번호 입력>>");
			int cus_no = Integer.parseInt(sc.nextLine());
			CustomerDTO cusNo = cdao.getCusNo(cus_no);
			if(cusNo == null) {
				System.out.println("고객번호가 없어서 저장프로시저를 수정 못합니다.");
			}
			else {
				sql = "{call customer_pro(?,?,?,?)}";
				ct = con.prepareCall(sql);
				ct.setInt(4, cus_no);
				ct.registerOutParameter(1, java.sql.Types.VARCHAR);
				ct.registerOutParameter(2, java.sql.Types.VARCHAR);
				ct.registerOutParameter(3, java.sql.Types.VARCHAR);
				ct.execute();
				
				System.out.println("고객번호 \t 고객이름 \t 고객폰번호 \t 고객이메일");
				System.out.println("=======================================================");
				System.out.println(cus_no+"\t"+ct.getString(1)+"\t"+ct.getString(2)+"\t"+ct.getString(3));
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(ct != null) ct.close();
				if(con != null) con.close();
				if(sc != null) sc.close();
			} catch (Exception e) {e.printStackTrace();}
		}
	}

}
