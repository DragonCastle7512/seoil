import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardsList {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "night";
		String pwd = "night";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select * from boards order by bno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("no \t name \t title \t cont \t date");
			System.out.println("----------------------------------------------------------------");
			while(rs.next()) {
				System.out.print(rs.getInt("bno"));
				System.out.print("\t"+rs.getString("bwriter"));
				System.out.print("\t"+rs.getString("btitle"));
				System.out.print("\t"+rs.getString("bcontent"));
				System.out.print("\t"+rs.getString("bdate")+"\n");
			}
			//rs.close();
			pstmt.close();
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
	}

}
