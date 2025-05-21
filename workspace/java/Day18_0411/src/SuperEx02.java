class Father02 {
	int x = 1, y = 2;
	public Father02(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Son02 extends Father02 {
	int z = 3;
	public Son02() {
		this(10, 20, 30);
	}
	Son02(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	void print() {
		System.out.println("x="+x+", y="+y+", z="+z);
	}
}
public class SuperEx02 {

	public static void main(String[] args) {

		Son02 son02 = new Son02();
		son02.print();
	}

}
