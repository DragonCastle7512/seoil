class A2 {
	@Override
	public String toString() {
		return "4";
	}
}
class B2 extends A2 {
	@Override
	public String toString() {
		return super.toString()+"3";
	}
}
public class Ex16_09 {

	public static void main(String[] args) {

		A2 a = new A2();
		B2 b = new B2();
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
