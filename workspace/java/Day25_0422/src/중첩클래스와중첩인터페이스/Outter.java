package 중첩클래스와중첩인터페이스;

public class Outter {

	public void method01(final int arg) {
		final int localVariable = 1;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg+localVariable;
			}
		}
	}
	//Java 8 이후부터는 매개변수나 지역변수를 자동으로 final로 인식
	public void method02(int arg) { //final이 생략됨
		//final이 생략됨
		int localVariable = 1;
		//arg = 10;
		//localVariable = 100;
		class Inner {
			public void method() {
				int result = arg+localVariable;
			}
		}
	}
}
