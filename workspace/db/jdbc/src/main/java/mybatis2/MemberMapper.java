package mybatis2;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

//@Mapper 없어도 setting.xml에서 bean 생성
public interface MemberMapper {
	@Insert("insert into member(id, password) values(#{id}, #{password})")
	public int save(@Param("id") String id,@Param("password") String password);
	@Select("select * from member where id=#{id}")
	public Member findById(String id);
	@Select("select * from member")
	public List<Member> findAll();
	@Update("update member set password=#{password} where id=#{id}")
	public int update(Member member);
	@Delete("delete from member where id=#{id}")
	public int delete(String id);
}
