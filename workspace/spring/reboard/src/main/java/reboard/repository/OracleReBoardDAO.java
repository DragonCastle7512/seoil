package reboard.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reboard.vo.ReBoard;
import reboard.vo.ReplyBoardForm;

@Repository
public class OracleReBoardDAO implements ReBoardDAO {
	
	@Autowired
	DataSource ds;

	@Override
	public int save(ReBoard reboard) {
		int result = 0;
		String sql = "insert into reboard(id,title,author,content,attachment,"
				+ "createdate,viewcnt,type,isdel,updatedate,parentid,tab) "
				+ "values(reboard_id_seq.nextval,?,?,?,?,"
				+ "sysdate,0,'일반게시판',0,null,0,0)";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, reboard.getTitle());
			pstmt.setString(2, reboard.getAuthor());
			pstmt.setString(3, reboard.getContent());
			pstmt.setString(4, reboard.getAttachment());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}
	public int replySave(ReBoard reboard) {
		int result = 0;
		String sql = "insert into reboard(id, title, content, author, parentid, attachment,"
				+ " createdate, type, tab) "
				+ "values(reboard_id_seq.nextval, ?, ?, ?, ?, ?,"
				+ "sysdate, '일반게시판', ?)";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			//전달 받은 ReplyBoardForm 정보
			pstmt.setString(1, reboard.getTitle());
			pstmt.setString(2, reboard.getContent());
			pstmt.setString(3, reboard.getAuthor());
			pstmt.setInt(4, reboard.getParentid());
			pstmt.setString(5, reboard.getAttachment());
			//기존값
			pstmt.setInt(6, reboard.getTab());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
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
						.attachment(rs.getString("attachment"))
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
		String sql = "select * from reboard where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				ReBoard board = ReBoard.builder().build();
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setAuthor(rs.getString("author"));
				board.setCreateDate(rs.getDate("createDate"));
				board.setContent(rs.getString("content"));
				board.setAttachment(rs.getString("attachment"));
				board.setViewcnt(rs.getInt("viewcnt"));
				board.setType(rs.getString("type"));
				board.setUpdatedate(rs.getDate("updatedate"));
				board.setParentid(rs.getInt("parentid"));
				board.setTab(rs.getInt("tab"));
				rs.close(); pstmt.close();
				return board;
			}
			return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public int update(ReBoard reboard) {
		int result = 0;
		String sql = "update reboard set "
				+ "title=?, author=?, createdate=?, content=?, attachment=?, viewcnt=?, type=?, "
				+ "isdel=0, updatedate=sysdate, parentid=0, tab=0 "
				+ "where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setString(1, reboard.getTitle());
			pstmt.setString(2, reboard.getAuthor());
			pstmt.setDate(3, (Date)reboard.getCreateDate());
			pstmt.setString(4, reboard.getContent());
			pstmt.setString(5, reboard.getAttachment());
			pstmt.setInt(6, reboard.getViewcnt()+1);
			pstmt.setString(7, reboard.getType());
			pstmt.setInt(8, reboard.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
//		String sql = "delete from reboard where id=?";
		String sql = "update reboard set isdel=1 where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
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

	@Override
	public int viewCountup(int id) {
		String sql = "update reboard set viewcnt=viewcnt+1 where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);
			int rs = pstmt.executeUpdate();
			pstmt.close();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
}
