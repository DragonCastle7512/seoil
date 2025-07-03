package mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//context-scan
@Service("memberService")
public class MemberService {
	
	@Autowired
	MemberMapper mapper;
	
	//mybatiis-scan으로 등록
	public int save(String id, String password) {
		return mapper.save(id, password);
	}

	public Member getMember(String id) {
		return mapper.findById(id);
	}

	public List<Member> getMemberList() {
		return mapper.findAll();
	}

	public int update(Member member) {
		return mapper.update(member);
	}

	public int delete(String id) {
		return mapper.delete(id);
	}
}
