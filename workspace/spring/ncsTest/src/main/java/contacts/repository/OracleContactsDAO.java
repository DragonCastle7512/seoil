package contacts.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import contacts.vo.Contact;


@Repository
public class OracleContactsDAO implements ContactsDAO {
	
	@Autowired
	DataSource ds;
	
	@Override
	public List<Contact> findAll(int start, int end) {
		String sql = "select * from"
				+ " (select rownum rid, t1.* from"
				+ " (select * from contacts) t1)"
				+ " where ? <= rid and rid <= ?";
		List<Contact> con = new ArrayList<>();
		try(PreparedStatement ps = ds.getConnection().prepareStatement(sql)) {
			ps.setInt(1, start);
			ps.setInt(2, end);
			try(ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					con.add(new Contact(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("hp"),
						rs.getString("email"),
						rs.getString("address"),
						rs.getString("memo")
					));
				}
			} catch (Exception e) {e.printStackTrace(); return null;}
		} catch (Exception e) {e.printStackTrace(); return null;}
		return con;
	}

	@Override
	public int save(Contact con) {
		int result = 0;
		String sql = "insert into contacts values(contacts_seq.nextval, ?, ?, ?, ?, ?)";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			String[] ele = {con.getName(), con.getHp(),con.getEmail(), con.getAddress(), con.getMemo()};
			for (int i = 0; i < ele.length; i++)
				pstmt.setString(i+1, ele[i]);
			result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}

	@Override
	public Contact findById(int id) {
		String sql = "select * from contacts where id=?";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return new Contact(
					rs.getInt("id"),
					rs.getString("name"),
					rs.getString("hp"),
					rs.getString("email"),
					rs.getString("address"),
					rs.getString("memo")
				);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	@Override
	public int update(Contact con) {
		int result = 0;
		String sql = "update contacts set name=?, hp=?, email=?, address=?, memo=? where id=?";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			String[] ele = {con.getName(), con.getHp(), con.getEmail(), con.getAddress(), con.getMemo()};
			for (int i = 0; i < ele.length; i++)
				pstmt.setString(i+1, ele[i]);
			pstmt.setInt(ele.length+1, con.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("DB연결 실패");
			e.printStackTrace();
			return -1;
		}
		return result;
	}

	@Override
	public int delete(int id) {
		int result = 0;
		String sql = "delete from contacts where id=?";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			pstmt.setInt(1, id);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}

	public int count() {
		String sql = "select count(*) count from contacts";
		try (PreparedStatement pstmt = ds.getConnection().prepareStatement(sql)) {
			try(ResultSet rs = pstmt.executeQuery()) {
				if(rs.next()) {
					int totalCount = rs.getInt("count");
					rs.close();
					return totalCount;
				}
			} catch (Exception e) {e.printStackTrace();}
		} catch (Exception e) {e.printStackTrace();}
		return 0;
	}
	
}
