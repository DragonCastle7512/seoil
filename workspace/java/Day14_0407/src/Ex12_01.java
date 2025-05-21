
public class Ex12_01 {

	static int p(int a, int b) {
		return (a>b) ? a : b;
	}
	static double p(double a, double b) {
		return (a>b) ? a : b;
	}
	public static void main(String[] args) {

		System.out.println(p(5, 9));
		System.out.println(p(4.5, 4.4));
	}

}
