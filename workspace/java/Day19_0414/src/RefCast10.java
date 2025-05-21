class Mother10 {
	int a = 100;
	void m() {
		System.out.println("부모");
	}
}
class Child10 extends Mother10 {
	int a = 200;

	@Override
	void m() {
		System.out.println("a="+a);
		System.out.println("this.a="+this.a);
		System.out.println("super.a="+super.a);
	}
	
}
public class RefCast10 {

	public static void main(String[] args) {

		Mother10 m = new Child10();
		System.out.println("m.a="+m.a);
		m.m();
	}

}
