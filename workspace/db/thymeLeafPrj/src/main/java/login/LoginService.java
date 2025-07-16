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

import member.Member;
import member.MemberMapper;

@Service("loginService")
public class LoginService implements UserDetailsService {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public LoginService() {
		System.out.println("Service 생성");
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//1) username 전달
		System.out.println("로그인 폼으로부터 전달한 username: "+username);
		//2) SessionFactory를 이용하여 mapper 가져오기
		SqlSession session =  sqlSessionFactory.openSession();
		MemberMapper memberMapper = session.getMapper(MemberMapper.class);
		Member member = memberMapper.findByUsername(username);
		System.out.println(member);
		//3) 로그인 결과 처리
		//user객체가 로그인 처리: org.springframework.security.core.userdetails.User.class
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		if(member.getRole().equals("ROLE_ROOT")) {
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		}
		else if(member.getRole().equals("ROLE_ADMIN"))
			authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		else if(member.getRole().equals("ROLE_USER"))
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		//db password가 암호화 되어 있을 때
//		User user = new User(member.getUsername(), member.getPassword(), authorities);
		
		//db password가 암호화 되어 있지 않을 때
		//why? -> Spring Security 내부에서 PasswordEncoder.matches(rawPassword, encodedPassword)로 암호화된 값과 비교하기 때문
		User user = new User(member.getUsername(), new BCryptPasswordEncoder().encode(member.getPassword()), authorities);
		
		//System.out.println("user 정보:"+user);
		return user;
	}

}
