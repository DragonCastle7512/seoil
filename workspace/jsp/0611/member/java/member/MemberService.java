package member;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;

public class MemberService {

	MemberDAO dao;
	public MemberService(ServletContext context) {
		System.out.println("MemberService »ý¼º");
		dao = new MemberDAO(context);
	}
	public MemberService(ServletConfig config) {
		dao = new MemberDAO(config);
	}
	public int save(Member member) {
		return dao.save(member);
	}
	public boolean loginconfirm(String id, String password) {
		Member member = dao.findById(id);
		return (id.equals(member.getId()) && password.equals(member.getPassword())) ? true : false;
	}

}
