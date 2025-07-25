package register;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
	
	@Autowired
	MemberMapper dao;

	public void save(RegisterForm form) {
		Member member = new Member();
		BeanUtils.copyProperties(form, member);
		member.setRole("ROLE_USER");
		dao.save(member);
	}
}
