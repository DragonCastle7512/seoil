/* 트랜잭션: 논리적 기능 처리의 최소 단위
* 출/입금 시 모두 성공하거나 모두 실패해야한다.
* 
* 트랜잭션 처리에는 commit(처리 성공)과 rollback(실행 전으로 되돌리기)으로 처리할 수 있다.
* 
* JDBC에서는 insert,update,delete 문을 실행할 때마다 자동 커밋이 일어난다.
* 따라서 트랜젝션 코드를 제어하려면 자동 커밋 기능을 꺼야한다. -> setAutoCommit()
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TransactionExample {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "night";
		String pwd = "night";
		
		Connection con = null;
		String sql01 = null;
		String sql02 = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			
			con.setAutoCommit(false);
			
			int money = 10000;
			try(PreparedStatement pstmt01 = con.prepareStatement(sql01)) {
				sql01 = "update accounts set balance = balance - ? where ano = ?";
				pstmt01.setInt(1, money);
				pstmt01.setString(2, "111-1111-1111");
				
				int re01 = pstmt01.executeUpdate();
				if(re01 == 0) throw new Exception("출금 실패");
			}
			try(PreparedStatement pstmt02 = con.prepareStatement(sql02)) {
				sql02 = "update accounts set balance = balance + ? where ano = ?";
				pstmt02.setInt(1, money);
				pstmt02.setString(2, "222-2222-2222");
				
				int re02 = pstmt02.executeUpdate();
				if(re02 == 0) throw new Exception();
			}
			
			con.commit();
			System.out.println("계좌 이체 성공");
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (Exception e2) {}
			System.out.println("계좌 이체 실패");
			e.printStackTrace();
		}
		finally {
			if(con != null)
			try {
				con.setAutoCommit(true);
				con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
	}                                                                                                                                                                                                                                                                            

}
