package mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisMain {
	
	public static void main(String[] args) {
		//x.java -> x.xml(sql��): �� ������ ����
		//mybatis ���̺귯�� �߰�
		
		//MemberMapper.java - MemberMapper.xml(�������̽� ����)
		//MemberMapper.xml ����� �� �÷����� ��ġ
		//MemberMapper.xml ����
		//MemberMapper.java ����
		//MemberMapper.java�� ����� MapperService.java ����
		//VO��ü�� �ݵ�� bean���� �����ؾ��� @Component
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
