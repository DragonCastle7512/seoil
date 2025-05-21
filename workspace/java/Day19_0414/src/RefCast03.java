class Mother03 {
	public void m03() {
		System.out.println("부모");
	}
}
class Child03 extends Mother03 {
	public void ch03() {
		System.out.println("자식");
	}
}
public class RefCast03 {

	public static void main(String[] args) {

		//사전에 업캐스팅을 안함
		Mother03 m03 = new Mother03();
		//명시적인 다운 캐스팅
		Child03 ch03 = (Child03)m03;
		//예외 오류
		ch03.ch03();
		ch03.m03();
		
	}

}
