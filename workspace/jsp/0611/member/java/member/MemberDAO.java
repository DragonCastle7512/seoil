package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class MemberDAO {

	Connection conn;
	DBConfig dbconfig;
	public MemberDAO(ServletContext context) {
		dbconfig = new DBConfig();
		dbconfig.setDriver(context.getInitParameter("driver"));
		dbconfig.setUrl(context.getInitParameter("url"));
		dbconfig.setUser(context.getInitParameter("user"));
		dbconfig.setPassword(context.getInitParameter("password"));
		try {
			Class.forName(dbconfig.getDriver());
			conn = DriverManager.getConnection(dbconfig.getUrl(), dbconfig.getUser(), dbconfig.getPassword());
		} catch (Exception e) {}
		System.out.println(dbconfig);
	}
	
	public MemberDAO() {
		//driver, url, user, password 정보를 web.xml에 숨겨서 사용
		System.out.println("MemberDAO 생성");
		
		try {
			Class.forName(dbconfig.getDriver());
			conn = DriverManager.getConnection(dbconfig.getUrl(), dbconfig.getUser(), dbconfig.getPassword());
		} catch (Exception e) {}
	}
	public MemberDAO(ServletConfig config) {
		dbconfig = new DBConfig();
		dbconfig.setDriver(config.getInitParameter("driver"));
		dbconfig.setUrl(config.getInitParameter("url"));
		dbconfig.setUser(config.getInitParameter("user"));
		dbconfig.setPassword(config.getInitParameter("password"));
		try {
			Class.forName(dbconfig.getDriver());
			conn = DriverManager.getConnection(dbconfig.getUrl(), dbconfig.getUser(), dbconfig.getPassword());
		} catch (Exception e) {}
		System.out.println("*******");
		System.out.println(dbconfig);
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
