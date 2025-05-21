class Mother06 {
	public void m06() {
		System.out.println("부모");
	}
}
class Child06 extends Mother06 {
	
	@Override
	public void m06() {
		System.out.println("오버라이딩 메서드");
	}
	public void ch06() {
		System.out.println("자식");
	}
	
}
public class RefCast06 {

	public static void main(String[] args) {
		
		Mother06 m06 = new Child06();
		m06.m06();
	}

}
