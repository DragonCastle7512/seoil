package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PhonebookDAOOracle implements PhonebookDAO {

	Connection conn;
	public PhonebookDAOOracle() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "night", "night");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test() {
		Phonebook pb = new Phonebook(0, "das", "010-1234-1243", "fqwf@gmail.com", "안녕");
		//insert(pb);
		System.out.println(findAll());
	}
	@Override
	public int insert(Phonebook pb) {
		String sql = "insert into phonebook values(pb_id_seq.nextval, ?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pb.getName());
			pstmt.setString(2, pb.getHp());
			pstmt.setString(3, pb.getEmail());
			pstmt.setString(4, pb.getMemo());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Phonebook> findAll() {
		String sql = "select * from phonebook";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			List<Phonebook> list = new ArrayList<Phonebook>();
			while(rs.next()) {
				Phonebook pb = new Phonebook();
				pb.setId(rs.getInt("id"));
				pb.setName(rs.getString("name"));
				pb.setHp(rs.getString("hp"));
				pb.setEmail(rs.getString("email"));
				pb.setMemo(rs.getString("memo"));
				list.add(pb);
			}
			return list;
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Phonebook findById(int id) {
		String sql = "select * from phonebook where id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Phonebook pb = new Phonebook();
				pb.setId(rs.getInt("id"));
				pb.setName(rs.getString("name"));
				pb.setHp(rs.getString("hp"));
				pb.setEmail(rs.getString("email"));
				pb.setMemo(rs.getString("memo"));
				return pb;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int updateById(Phonebook pb) {
		String sql = "update phonebook set name=?, hp=?, email=?, memo=? where id=?";
		Phonebook prepb = findById(pb.getId());
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (pb.getName() == null) ? prepb.getName() : pb.getName());
			pstmt.setString(2, (pb.getHp() == null) ? prepb.getHp() : pb.getHp());
			pstmt.setString(3, (pb.getEmail() == null) ? prepb.getEmail() : pb.getEmail());
			pstmt.setString(4, (pb.getMemo() == null) ? prepb.getMemo() : pb.getMemo());
			pstmt.setInt(5, pb.getId());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteById(int id) {
		String sql = "delete from phonebook where id=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
