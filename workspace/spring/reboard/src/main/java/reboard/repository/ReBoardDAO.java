package reboard.repository;

import java.util.List;

import reboard.vo.ReBoard;

public interface ReBoardDAO {
	public int save(ReBoard reboard);
	public List<ReBoard> findAll();
	public ReBoard findById(int id); 
	public int update(ReBoard reboard);
	public int delete(int id);
	List<ReBoard> findAll(int startnum, int endnum);
	public int count();
}
