package mybatis2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisMain {
	
	public static void main(String[] args) {
		
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("mybatis2/setting.xml");
		 MemberService service = (MemberService) ctx.getBean("memberService", mybatis2.MemberService.class);
		 //���� �׽�Ʈ
//		 service.save("user1", "1234");
		 
		 //������� �׽�Ʈ
//		 System.out.println(service.getMember("user1"));
		 
		 //��ü��� �׽�Ʈ
//		 System.out.println(service.getMemberList());
		 
		 //�����׽�Ʈ
//		 Member member = new Member();
//		 member.setId("user1");
//		 member.setPassword("2222");
//		 System.out.println(service.update(member));
		 
		 //���� �׽�Ʈ
//		 System.out.println(service.delete("user1"));
		 
	}
}
