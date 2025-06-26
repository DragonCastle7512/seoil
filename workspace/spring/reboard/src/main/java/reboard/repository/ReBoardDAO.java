package reboard.repository;

import java.util.List;

import reboard.vo.ReBoard;
import reboard.vo.ReplyBoardForm;

public interface ReBoardDAO {
	public int save(ReBoard reboard);
	public int replySave(ReBoard reboard);
	public ReBoard findById(int id); 
	public int update(ReBoard reboard);
	public int delete(int id);
	List<ReBoard> findAll(int startnum, int endnum);
	public int count();
	public int viewCountup(int id);
}
