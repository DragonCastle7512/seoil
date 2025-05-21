class Mother08 {
	int x = 100;
	void method() {
		System.out.println("부모클래스");
	}
}
class Child08 extends Mother08 {
	int x = 200;
	
	@Override
	void method() {
		System.out.println("오버라이딩");
	}
	
}
public class RefCast08 {

	public static void main(String[] args) {

		Mother08 m = new Child08();
		System.out.println("m.x="+m.x);
		
		Child08 ch = new Child08();
		ch.method();
		System.out.println("ch.x="+ch.x);
		
		Mother08 m2 = new Mother08();
		m2.method();
		System.out.println("m2.x="+m2.x);
	}

}
