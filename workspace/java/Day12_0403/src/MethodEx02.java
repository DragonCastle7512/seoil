
public class MethodEx02 {

	static int getTotal(int n) {
		int total = 0;
		for (int i = 0; i < n; i++)
			total += i;
		return total;
	}
	public static void main(String[] args) {

		int total = getTotal(10);
		System.out.println(total);
	}

}
