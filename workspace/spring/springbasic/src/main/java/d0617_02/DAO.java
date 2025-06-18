package d0617_02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class DAO {
//	Connection conn;
	DataSource ds;
	public DAO() {
		System.out.println("DAO积己磊 积己!!");
	}
	public void exec() {
		System.out.println("dao exec窃荐 角青");
		try {
			System.out.println(ds.getConnection());
			String sql = "insert into phonebook values('全辨悼', '010-1111-1111')";
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (Exception e) {e.printStackTrace();}
	}
	/*
	private static Connection conn;
	public Connection getInstance() {
		if(conn == null) {
			try {
			Class.forName("oracle.jdbc.driver");
			conn = DriverManager.getConnection("jdbc:oracle:th:driver@localhost:1521:xe", "night", "night");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}*/
}
