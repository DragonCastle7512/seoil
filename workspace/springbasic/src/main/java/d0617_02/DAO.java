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
		System.out.println("DAO������ ����!!");
	}
	public void exec() {
		System.out.println("dao exec�Լ� ����");
		try {
			System.out.println(ds.getConnection());
			String sql = "insert into phonebook values('ȫ�浿', '010-1111-1111')";
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
