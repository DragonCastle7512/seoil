package restapi;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExternalMemberMapper {
	 public int save(ExternalMember member);
	 public List<ExternalMember> findAll();
	 public void deleteAll();
}
