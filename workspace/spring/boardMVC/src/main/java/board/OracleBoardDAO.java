package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OracleBoardDAO implements BoardDAO {
	
	@Autowired
	DataSource ds;
	
	public OracleBoardDAO() {
		System.out.println("dao");
	}

	@Override
	public int save(Board form) {
		int result = 0;
		String sql = "insert into board values(board_id_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			pstmt.setString(1, form.getTitle());
			pstmt.setString(2, form.getAuthor());
			pstmt.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			pstmt.setString(4, form.getContent());
			pstmt.setString(5, form.getAttachment());
			pstmt.setInt(6, 0);
			pstmt.setString(7, "자유게시판");
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}

	@Override
	public List<Board> findAll(int startnum, int endnum) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("select * from ");
		sb.append("(select rownum rid, t1.* from ");
		sb.append("(select * from board order by id asc) t1) ");
		sb.append("where ? <= rid and rid <= ?");
		Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
		List<Board> list = new ArrayList<Board>();
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, startnum);
			pstmt.setInt(2, endnum);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setTitle(rs.getString("title"));
				board.setAuthor(rs.getString("author"));
				board.setCreateDate(rs.getDate("createDate"));
				board.setContent(rs.getString("content"));
				board.setAttachment(rs.getString("attachment"));
				board.setViewcnt(rs.getInt("viewcnt"));
				board.setType(rs.getString("type"));
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
	public Board findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Board pb) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int count() {
		String sql = "select count(*) count from board";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				//totalCount = rs.getInt("count(*)");
				int totalCount = rs.getInt("count");
				rs.close();
				pstmt.close();
				return totalCount;
			}
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
