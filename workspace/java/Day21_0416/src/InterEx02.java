interface InterA {
	default void display() {
		System.out.println("InterA display()");
	}
	static void staticMethod() {
		System.out.println("자바8에서 정적메서드 추가");
	}
}
interface InterB {
	default void display() {
		System.out.println("InterB display()");
	}
}
class ChildClass02 implements InterA, InterB {
	@Override
	public void display() {
		System.out.println("오버라이딩한 디폴트 메서드");
	}
}
public class InterEx02 {

	public static void main(String[] args) {

		ChildClass02 ch = new ChildClass02();
		ch.display();
		InterA.staticMethod();
	}

}
