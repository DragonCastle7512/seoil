package net.daum.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import net.daum.controller.BoardExample;
import net.daum.dto.BoardDTO;

public class BoardDAOImpl {
	
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "night";
	String pwd = "night";
	
	Connection con = null;
	PreparedStatement pt;
	ResultSet rs = null;
	String sql = null;
	
	BoardExample exitB = new BoardExample();
	public BoardDAOImpl() {
		try {
			Class.forName(driver);
			
		} catch (Exception e) {e.printStackTrace(); exitB.exit();}
	}
	public List<BoardDTO> getBoardList() {
		List<BoardDTO> blist = new ArrayList<>();
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select * from boards order by bno desc";
			pt = con.prepareStatement(sql);
			
			ResultSet rs = pt.executeQuery();
			while(rs.next()) {
				BoardDTO b = new BoardDTO();
				b.setBno(rs.getInt(1));
				b.setBwriter(rs.getString("bwriter"));
				b.setBdate(rs.getDate("bdate"));
				b.setBtitle(rs.getString("btitle"));
				blist.add(b);
			}
			
		} catch (Exception e) {e.printStackTrace(); exitB.exit();}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
		return blist;
	}
	public void insertBoard(BoardDTO board) {
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "insert into boards (bno, bwriter, btitle, bcontent) values(seq_bno.nextval,?,?,?)";
			pt = con.prepareStatement(sql);
			pt.setString(1, board.getBwriter());
			pt.setString(2, board.getBtitle());
			pt.setString(3, board.getBcontent());
			pt.executeUpdate();
			pt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exitB.exit();
		}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
	}
	/*public BoardDTO getFindNo(int bno) {
		BoardDTO findNo = null;
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "select * from boards where bno=?";
			pt = con.prepareStatement(sql);
			pt.setInt(1, bno);
			rs = pt.executeQuery();
			if(rs.next()) {
				findNo = new BoardDTO();
				findNo.setBno(rs.getInt("bno"));
				findNo.setBwriter(rs.getString("bwriter"));
				findNo.setBtitle(rs.getString("btitle"));
				findNo.setBdate(rs.getDate("bdate"));
				findNo.setBcontent(rs.getString("bcontent"));
			}
			rs.close();
			pt.close();
		} catch (Exception e) {
			e.printStackTrace();
			exitB.exit();
		}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e2) {}
		}
		return findNo;
	}*/
	public BoardDTO getBoardDTO(int bno) {
		BoardDTO bc = null;
		try {
			con = DriverManager.getConnection(url, user , pwd);
			sql = "select * from boards where bno=?";
			pt = con.prepareStatement(sql);
			pt.setInt(1, bno);
			rs = pt.executeQuery();
			if(rs.next()) {
				bc = new BoardDTO();
				bc.setBno(rs.getInt("bno"));
				bc.setBwriter(rs.getString("bwriter"));
				bc.setBtitle(rs.getString("btitle"));
				bc.setBcontent(rs.getString("bcontent"));
				bc.setBdate(rs.getDate("bdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			exitB.exit();
		}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {e.printStackTrace();}
		}
		return bc;
	}
	public void updateBoard(BoardDTO bc) {
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "update boards set bwriter=?, btitle=?, bcontent=? where bno=?";
			pt = con.prepareStatement(sql);
			pt.setString(1, bc.getBwriter());
			pt.setString(2, bc.getBtitle());
			pt.setString(3, bc.getBcontent());
			pt.setInt(4, bc.getBno());
			pt.executeUpdate();
		} catch (Exception e) {}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {}
		}
		
	}
	public void deleteBoard(BoardDTO bc) {
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "delete from boards where bno=?";
			pt = con.prepareStatement(sql);
			pt.setInt(1, bc.getBno());
			pt.executeUpdate();
		}
		catch (Exception e) {}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
	public void deleteAllBoard() {
		try {
			con = DriverManager.getConnection(url, user, pwd);
			sql = "delete from boards";
			pt = con.prepareStatement(sql);
			pt.executeUpdate();
		}
		catch (Exception e) {}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {}
		}
	}
}
