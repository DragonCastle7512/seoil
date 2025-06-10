package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {

	Connection conn;
	public MemberDAO() {
		//driver, url, user, password 정보를 web.xml에 숨겨서 사용
		System.out.println("MemberDAO 생성");
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
		} catch (Exception e) {}
	}
	public int save(Member member) {
		try {
			String sql = "insert into member(id, password, hp, email, address, pic) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			String[] infor = {member.getId(), member.getPassword(), member.getHp(), member.getEmail(), member.getAddress(), member.getPic()};
			for (int i = 0; i < infor.length; i++)
				pstmt.setString(i+1, infor[i]);
			int result = pstmt.executeUpdate();
			pstmt.close();
			return result;
		} catch (Exception e) {e.printStackTrace();}
		return -1;
	}
	public Member findById(String id) {
		try {
			String sql = "select id,password from member where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Member member = new Member();
				member.setId(rs.getString("id"));
				member.setPassword(rs.getString("password"));
				rs.close();
				pstmt.close();
				return member;
			}
		} catch (Exception e) {}
		return null;
	}

}
