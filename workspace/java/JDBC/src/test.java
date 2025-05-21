import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "night", "night");
			String sql = "insert into tbl_board7 (bno, bname, btitle, bcont) values(bno_seq2.nextval,?,?,?)";
			try(PreparedStatement pstmt = con.prepareStatement(sql);
				Scanner sc = new Scanner(System.in);) {
				String[] s = {"작성자", "제목", "내용"};
				for (int i = 1; i <= 3; i++) {
					System.out.print(s[i-1]+" 입력>> ");
					pstmt.setString(i, sc.nextLine());
				}
				pstmt.executeUpdate();
				System.out.println("업데이트 완료");
			}
		}catch (Exception e) {}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}

}
