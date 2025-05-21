import net.daum.dto.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {

		MemberDTO member = new MemberDTO();
		member.setMem_id("kkkkk");
		member.setMem_pwd("77777");
		member.setMem_name("홍길동");
		member.setMem_addr("서울시 중랑구");
		member.setMem_phone("010-777-7777");
		
		System.out.println("아이디: "+member.getMem_id());
		System.out.println("비밀번호: "+member.getMem_pwd());
		System.out.println("이름: "+member.getMem_name());
		System.out.println("주소: "+member.getMem_addr());
		System.out.println("전화번호: "+member.getMem_phone());
	}

}
