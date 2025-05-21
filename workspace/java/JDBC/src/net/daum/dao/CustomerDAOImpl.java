package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import net.daum.dto.CustomerDTO;

public class CustomerDAOImpl {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String user = "night";
	String pwd = "night";
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	public CustomerDAOImpl() {
		try {
			Class.forName(driver);
		} catch (Exception e) {e.printStackTrace();}
	}
	public CustomerDTO getCusNo(int cus_no) {
		CustomerDTO cusNo = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select cus_no from customer where cus_no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, cus_no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cusNo = new CustomerDTO();
				cusNo.setCus_no(rs.getInt("cus_no"));
			}
		} catch (Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
		return cusNo;
	}
}
