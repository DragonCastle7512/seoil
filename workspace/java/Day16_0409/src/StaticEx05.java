class St05 {
	static int a = 10;
	int b = 20;
	static void printA() {
		System.out.println(a);
		//System.out.println(this.b);
	}
	void printB() {
		System.out.println(a);
		System.out.println(this.b);
	}
	static void printC() {
		//System.out.println(b);
	}
}
public class StaticEx05 {

	public static void main(String[] args) {

	}

}
