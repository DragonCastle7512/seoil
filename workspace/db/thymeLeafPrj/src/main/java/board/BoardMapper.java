package board;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BoardMapper {
	@Insert("insert into board values(board_id_seq.nextval, #{id}, #{password}, #{title}, #{author}, SYSDATE, #{content}, #{attachment}, 0, '자유게시판'")
	public int save(Board form);
	@Select("select * from"
			+ " (select rownum rid, t1.* from"
			+ " (select * from board order by id asc) t1)"
			+ " where #{startnum} <= rid and rid <= #{endnum}")
	public List<Board> findAll(@Param("startnum") int startnum, @Param("endnum") int endnum);
	@Select("select * from board where id=#{id}")
	public Board findById(int id);
	@Update("update board set title=#{title}, author=#{author}, content=#{content}, attachment=#{attachment} where id=#{id}")
	public int update(Board board);
	@Delete("delete from board where id=#{id}")
	public int delete(int id);
	@Select("select count(*) count from board")
	public int count();
	@Update("update board set viewcnt=viewcnt+1 where id=#{id}")
	public int viewCountup(int id);
}
