package repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vo.Phonebook;

@Repository
public class H2DAOPhonebook implements PhonebookInter {

	@Autowired
	DataSource ds;
	
	@Override
	public int save(Phonebook pb) {
		int result = 0;
		String sql = "insert into phonebook(name, hp, email, memo) values(?, ?, ?, ?)";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			String[] ele = {pb.getName(), pb.getHp(),pb.getEmail(), pb.getMemo()};
			for (int i = 0; i < ele.length; i++)
				pstmt.setString(i+1, ele[i]);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		return result;
	}
	@Override
	public List<Phonebook> findAll() {
		String sql = "select * from phonebook";
		List<Phonebook> pbs = new ArrayList<>();
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Phonebook pb = new Phonebook();
				pb.setId(rs.getInt("id"));
				pb.setName(rs.getString("name"));
				pb.setHp(rs.getString("hp"));
				pb.setEmail(rs.getString("email"));
				pb.setMemo(rs.getString("memo"));
				pbs.add(pb);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return pbs;
	}

	@Override
	public Phonebook findById(int id) {
		String sql = "select * from phonebook where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
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
			return null;
		}
		return null;
	}

	@Override
	public int update(Phonebook pb) {
		int result = 0;
		String sql = "update phonebook set name=?, hp=?, email=?, memo=? where id=?";
		try {
			PreparedStatement pstmt = ds.getConnection().prepareStatement(sql);
			String[] ele = {pb.getName(), pb.getHp(),pb.getEmail(), pb.getMemo()};
			for (int i = 0; i < ele.length; i++)
				pstmt.setString(i+1, ele[i]);
			pstmt.setInt(5, pb.getId());
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
		String sql = "delete from phonebook where id=?";
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

}
