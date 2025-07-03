package mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisMain {
	
	public static void main(String[] args) {
		//x.java -> x.xml(sql문): 두 파일을 연결
		//mybatis 라이브러리 추가
		
		//MemberMapper.java - MemberMapper.xml(인터페이스 파일)
		//MemberMapper.xml 만들기 전 플러그인 설치
		//MemberMapper.xml 생성
		//MemberMapper.java 생성
		//MemberMapper.java를 사용할 MapperService.java 생성
		//VO객체도 반드시 bean으로 생성해야함 @Component
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis/setting.xml");
		 MemberService service = (MemberService)ctx.getBean("memberService", mybatis.MemberService.class);
//		 service.save("user3", "1234");
//		 System.out.println(service.getMember("user1"));
		 //System.out.println(service.getMemberList());
//		 
//		 Member member = new Member();
//		 member.setId("user1");
//		 member.setPassword("2222");
//		 service.update(member);
//		 System.out.println(service.getMember("user1"));
		 
		 //service.delete("user1");
		 System.out.println(service.getMemberList());
		 
		 
	}
}
