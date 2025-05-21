class Parent05 extends Object {
	protected int x = 10;
	protected int y = 20;
	public Parent05() {
		super();
		System.out.println("Parent05() 기본 생성자");
	}
}
class Child05 extends Parent05 {
	protected int z = 30;
	public Child05() {
		System.out.println("Child05() 기본 생성자");
	}
	public void print() {
		System.out.println("x="+x+", y="+y+", z="+z);
	}
}
public class ExtendTest05 {

	public static void main(String[] args) {

		Child05 ch05 = new Child05();
		ch05.print();
	}

}
