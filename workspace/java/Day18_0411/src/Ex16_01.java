class Parent {
	private int a;
	int b;
	protected int c;
	public int d;
}
class Child extends Parent {
	public Child(int a, int b, int c, int d) {
		//this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	void func() {
		//System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
public class Ex16_01 {

	public static void main(String[] args) {

		Child one = new Child(1, 2, 3, 4);
		one.func();
		//System.out.println(one.a);
		System.out.println(one.b);
		System.out.println(one.c);
		System.out.println(one.d);
	}

}
