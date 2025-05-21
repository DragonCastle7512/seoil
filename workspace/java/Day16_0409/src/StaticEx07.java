record Member(String id, String name, int age) {
	
}
public class StaticEx07 {

	public static void main(String[] args) {

		Member member = new Member("kkkkk", "홍길동", 26);
		System.out.println("아이디: "+member.id());
		System.out.println("이름: "+member.name());
		System.out.println("나이: "+member.age());
		System.out.println("\n=====================");
		
		Member m01 = new Member("spring", "벛꽃", 28);
		Member m02 = new Member("spring", "벛꽃", 28);
		System.out.println("m01.equals(m02) :"+ m01.equals(m02));
	}

}
