package board;

import java.util.List;

public interface BoardDAO {
	public int save(Board form);
	public List<Board> findAll(int startnum, int endnum);
	public Board findById(int id);
	public int update(Board board);
	public int delete(int id);
	public int count();
}