class Member02 {
	private String mem_id;
	private String mem_name;
	private String mem_addr;
	public Member02() {
		mem_id = "kkkkk";
		mem_name = "홍길동";
		mem_addr = "서울시 중랑구";
	}
	public Member02(String new_id, String new_name, String new_addr) {
		mem_id = new_id;
		mem_name = new_name;
		mem_addr = new_addr;
	}
	public void print() {
		System.out.println(mem_id+" "+mem_name+" "+mem_addr);
	}
}
public class ConsEx02 {

	public static void main(String[] args) {

		Member02 member = new Member02();
		member.print();
		
		Member02 member2 = new Member02("aaaa", "이순신", "서울시 동대문구");
		member2.print();
	}

}
