abstract class AbstractClass01 {
	abstract void method01();
	void method02() {
		System.out.println("method02");
	}
}
abstract class MiddleClass01 extends AbstractClass01 {
	void method03() {
		System.out.println("method03");
	}
}
class SubClass01 extends MiddleClass01 {
	@Override
	void method01() {
		System.out.println("오버라이딩 된 method01");
	}
}
public class AbsEx01 {

	public static void main(String[] args) {

		SubClass01 sub = new SubClass01();
		sub.method01();
		sub.method02();
		sub.method03();
	}

}
