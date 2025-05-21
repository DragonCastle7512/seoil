class A13 {
	public void method(B13 b) {
		b.methodB();
	}
}
class B13 {
	public void methodB() {
		System.out.println("methodB()");
	}
}
public class AbsEx13 {

	public static void main(String[] args) {

		A13 a13 = new A13();
		a13.method(new B13());
	}

}
