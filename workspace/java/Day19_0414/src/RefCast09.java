class Mother09 {
	int x = 100;
	void method() {
		System.out.println("부모클래스 메서드()");
	}
}
class Child09 extends Mother09 {
	
}
public class RefCast09 {

	public static void main(String[] args) {

		Mother09 m09 = new Child09();
		System.out.println("m09.x="+m09.x);
		m09.method();
		
		Child09 ch09 = new Child09();
		System.out.println("ch09.x="+ch09.x);
		ch09.method();
	}

}
