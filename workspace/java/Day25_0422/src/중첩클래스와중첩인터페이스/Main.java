package 중첩클래스와중첩인터페이스;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		A.B b = a.new B();
		b.field01 = 3;
		b.field02 = 30;
		b.method01();
		b.method02();
		
		A.C c = new A.C();
		c.field01 = 3;
		c.field02 = 30;
		c.method01();
		c.method02();
		
		a.method();
	}

}
