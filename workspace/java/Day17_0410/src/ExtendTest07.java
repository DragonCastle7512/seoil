class Parent07 {
	protected int x = 10;
	protected int y = 20;
	public Parent07(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Child07 extends Parent07 {
	protected int z = 30;
	public Child07() {
		super(100, 200);
	}
	public Child07(int x, int y, int z) {
		super(x, y);
	}
	public void print() {
		System.out.println("x="+x+", y="+y+", z="+z);
		
	}
}
public class ExtendTest07 {

	public static void main(String[] args) {

		Child07 ch07 = new Child07();
		ch07.print();
		
		Child07 ch08 = new Child07(1000, 3000, 5000);
		ch08.print();
	}

}
