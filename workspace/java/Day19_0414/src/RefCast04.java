class Mother04 {
	void m04() {
		System.out.println("부모");
	}
}
class Child04 extends Mother04 {
	void ch04() {
		System.out.println("자식");
	}
}
public class RefCast04 {

	public static void main(String[] args) {
		
		Mother04 m04 = new Child04();
		Child04 ch04 = (Child04)m04;
		ch04.ch04();
		ch04.m04();
	}

}
