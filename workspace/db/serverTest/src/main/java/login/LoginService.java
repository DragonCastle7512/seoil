package login;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import register.Member;
import register.MemberMapper;

@Service("loginService")
public class LoginService implements UserDetailsService {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SqlSession session =  sqlSessionFactory.openSession();
		MemberMapper memberMapper = session.getMapper(MemberMapper.class);
		Member member = memberMapper.findByUsername(username);
		if (member == null)
	        throw new UsernameNotFoundException("사용자를 찾을 수 없습니다: " + username);

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if(member.getRole().equals("ROLE_USER"))
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));

		User user = new User(member.getUsername(), new BCryptPasswordEncoder().encode(member.getPassword()), authorities);
		
		System.out.println("user 정보:"+user);
		return user;
	}

}
