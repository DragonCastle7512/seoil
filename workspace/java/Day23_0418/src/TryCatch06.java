class Member06 {
	String id = "aaaaa";
	String name = "홍길동";
	String addr = "서울시 장랑구";
}
public class TryCatch06 {

	public static void main(String[] args) {

		Member06 m = null;
		try {
			System.out.println(m.id+" "+m.name+" "+m.addr);
		} catch (Exception e) {
			System.out.println("예외 발생: "+e);
			m = new Member06();
			System.out.println(m.id+" "+m.name+" "+m.addr);
		}
	}

}
