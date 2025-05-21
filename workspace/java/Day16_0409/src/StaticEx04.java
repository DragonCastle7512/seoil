class St04 {
	private static int a = 10;
	private int b = 20;
	public static void setA(int new_a) {
		a = new_a;
	}
	public static int getA() {
		return a;
	}
}
public class StaticEx04 {

	public static void main(String[] args) {

		System.out.println(St04.getA());
	}

}
