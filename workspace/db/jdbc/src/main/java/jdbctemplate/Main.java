package jdbctemplate;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("jdbctemplate/setting.xml");
		JdbcTemplate jtmp = (JdbcTemplate)app.getBean("jdbcTemplate");
		
		String sql = "select count(*) from member";
		int count = jtmp.queryForObject(sql, Integer.class);
		System.out.println(count);
		
		String name = jtmp.queryForObject("select name from member where id=?", new Object[]{"M002"}, String.class);
		System.out.println(name);
		
		Member member = jtmp.queryForObject("select * from member where id=?", new Object[]{"M002"}, new MemberMapper());
		System.out.println(member);
		
		List<Member> list = jtmp.query("select * from member", new MemberMapper());
		System.out.println(list);
		
		sql = "insert into member values(?,?,?,?,?,?)";
		jtmp.update(sql,"test4","1111","유길동","강동구","010-2222-3333", "d@d.net");
		System.out.println(jtmp.query("select * from member", new MemberMapper()));
		
		sql = "update member set password=? where id=?";
		jtmp.update(sql,"2222","admin");
		System.out.println(jtmp.query("select * from member", new MemberMapper()));
		
		sql = "delete from member where id=?";
		jtmp.update(sql,"test4");
		System.out.println(jtmp.query("select * from member", new MemberMapper()));
	}

}
