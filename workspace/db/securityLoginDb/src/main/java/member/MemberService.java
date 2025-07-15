package member;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class MemberService {
	
	@Autowired
	MemberMapper dao;

	public void save(RegisterForm form) {
		Member member = new Member();
		BeanUtils.copyProperties(form, member);
		member.setRole("ROLE_USER");
		//java.sql.Date().getTime() long형
		member.setRegdate(new java.sql.Date(new java.util.Date().getTime()));
		dao.save(member);
	}

}
