package reboard.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reboard.vo.ReBoard;

@Repository
public class H2ReBoardDAO2 implements ReBoardDAO {
	
	@Autowired
	DataSource ds;

	@Override
	public int save(ReBoard reboard) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReBoard> findAll(int startnum, int endnum) {
		// TODO Auto-generated method stub
		return null;
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
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewCountup(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int replySave(ReBoard reboard) {
		// TODO Auto-generated method stub
		return 0;
	}
}
