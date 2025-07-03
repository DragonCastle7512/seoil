package mybatis2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisMain {
	
	public static void main(String[] args) {
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis2/setting.xml");
		 MemberService service = (MemberService) ctx.getBean("memberService", mybatis2.MemberService.class);
		 //저장 테스트
//		 service.save("user1", "1234");
		 
		 //선택출력 테스트
//		 System.out.println(service.getMember("user1"));
		 
		 //전체출력 테스트
//		 System.out.println(service.getMemberList());
		 
		 //수정테스트
//		 Member member = new Member();
//		 member.setId("user1");
//		 member.setPassword("2222");
//		 System.out.println(service.update(member));
		 
		 //삭제 테스트
//		 System.out.println(service.delete("user1"));
		 
	}
}
