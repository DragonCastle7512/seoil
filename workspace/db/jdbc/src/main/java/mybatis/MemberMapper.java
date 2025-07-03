package mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
	 public int save(@Param("id") String id,@Param("password") String password);
	 //@param이 없을 경우 오류 발생 원인
	 //xml에서 sql문이 id=값 - 없어도됨, values(값, 값..) - 필수
//	 public int save(String id,String password);
	 public Member findById(String id);
	 public List<Member> findAll();
	 public int update(Member member);
	 public int delete(String id);
}
