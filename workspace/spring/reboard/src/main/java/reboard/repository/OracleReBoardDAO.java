package reboard.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reboard.vo.ReBoard;

@Repository
public class OracleReBoardDAO implements ReBoardDAO {
	
	@Autowired
	DataSource ds;

	@Override
	public int save(ReBoard reboard) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReBoard> findAll(int startnum, int endnum) {
		String sql = "select * from"
				+ " (select rownum rid, t1.* from"
				+ " (select * from reboard where isdel=0"
				+ " start with parentid=0 connect by prior id=parentid"
				+ " order siblings by id asc) t1)"
				+ " where ? <= rid and rid <= ?";
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
		List<ReBoard> list = new ArrayList<ReBoard>();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startnum);
			pstmt.setInt(2, endnum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ReBoard board = ReBoard.builder()
						.id(rs.getInt("id"))
						.title(rs.getString("title"))
						.author(rs.getString("author"))
						.createDate(rs.getDate("createDate"))
						.content(rs.getString("title"))
						.attachment(rs.getString("title"))
						.viewcnt(rs.getInt("viewcnt"))
						.type(rs.getString("type"))
						.isdel(rs.getInt("isdel"))
						.updatedate(rs.getDate("updatedate"))
						.parentid(rs.getInt("parentid"))
						.tab(rs.getInt("tab"))
						.build();
				list.add(board);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
	        try { if (rs != null) rs.close(); } catch (Exception e) {}
	        try { if (pstmt != null) pstmt.close(); } catch (Exception e) {}
	        try { if (conn != null) conn.close(); } catch (Exception e) {}
	    }
		return list;
	}

	@Override
	public ReBoard findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(ReBoard reboard) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReBoard> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		String sql = "select count(*) count from reboard";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int totalCount = rs.getInt("count");
				rs.close();
				pstmt.close();
				return totalCount;
			}
			rs.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
