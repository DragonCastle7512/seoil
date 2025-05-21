package 중첩클래스와중첩인터페이스;

/* 인스턴스 맴버 내부클래스 -> 외부 클래스: 전부 접근 가능
 * 정적 맴버 내부클래스 -> 외부클래스: 정적 변수, 정적 메서드만 접근 가능
 */
public class A3 {
	int field01;
	void method01() {}
	static int field02;
	static void method02() {}
	class B {
		void method() {
			field01 = 10;
			method01();
			field02 = 100;
			method02();
		}
 	}
	static class C {
		void method() {
			//field01 = 100;
			//method01();
			field02 = 1000;
			method02();
		}
	}
}
