class Parent2 {
	protected int a, b, c;
	public Parent2() {
		System.out.println("Parent 클래스의 디폴트 생성자");
	}
	public Parent2(int a, int b, int c) {
		System.out.println("전달 인자 3개 Parent");
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
class Child03 extends Parent2 {
	protected int d;
	public Child03() {
		System.out.println("Child03");
	}
	public Child03(int a, int b, int c, int d) {
		super(a, b, c);
		this.d = d;
	}
}
public class Ex16_02 {

	public static void main(String[] args) {

		Parent2 p = new Parent2();
		Parent2 p2 = new Parent2(10, 20, 30);
		Child03 c = new Child03();
		Child03 c2 = new Child03(10, 20, 30, 40);
	}

}
