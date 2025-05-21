class Parent06 {
	protected int a = 10;
	protected int b = 20;
	public Parent06(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Child06 extends Parent06 {
	protected int c = 30;
	/*public Child06() {
		부모 클래스에 기본 생성자가 없음
	}*/
	public Child06(int a, int b) {
		super(a, b);
	}
	public void pr() {
		System.out.println("a="+a+", b="+b+", c="+c);
	}
}
public class ExtendTest06 {

	public static void main(String[] args) {

		Child06 ch06 = new Child06(0, 0);
		ch06.pr();
	}

}
