
public class OprEx08 {

	public static void main(String[] args) {

		int a = 1000000;
		int b = 1000000;
		long c = a*b;
		System.out.printf("%d * %d = %d\n", a, b, c);
		
		c = (long)a * b;
		System.out.println(c);
	}

}
