class A {
	public final int method01() {
		return 0;
	}
}
class B extends A {
	//final 메소드 오버로딩 불가
	/*public int method01() {
		return 100;
	}*/
}
public class AbsEx18_02 {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.method01());
	}

}
