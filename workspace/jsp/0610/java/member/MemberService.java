package member;

public class MemberService {

	MemberDAO dao;
	public MemberService() {
		System.out.println("MemberService »ý¼º");
		dao = new MemberDAO();
	}
	public int save(Member member) {
		return dao.save(member);
	}
	public boolean loginconfirm(String id, String password) {
		Member member = dao.findById(id);
		return (id.equals(member.getId()) && password.equals(member.getPassword())) ? true : false;
	}

}
