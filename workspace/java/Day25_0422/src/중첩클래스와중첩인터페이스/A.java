package 중첩클래스와중첩인터페이스;
/* 클래스 소속의 변수 위치에 따라 중첩 내부 클래스가 결정된다.*/
public class A {
	public A() {
		System.out.println("객체 A가 생성됨");
	}
	public class B {
		public B() {
			System.out.println("객체 B가 생성됨");
		}
		int field01;
		static int field02;
		void method01() {}
		static void method02() {}
	}
	static class C {
		C() {
			System.out.println("객체 C가 생성됨");
		}
		int field01;
		static int field02;
		void method01() {}
		static void method02() {}
	}
	void method() {
		class D {
			D() {
				System.out.println("객체 D가 생성됨");
			}
			int field01;
			static int field02;
			void method01() {}
			static void method02() {}		
		}
		D d = new D();
		d.field01 = 3;
		d.field02 = 10;
		d.method01();
		d.method02();
	}
}
