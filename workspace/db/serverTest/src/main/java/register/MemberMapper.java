package register;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	 public int save(Member member);
	 public Member findByUsername(String username);
}
