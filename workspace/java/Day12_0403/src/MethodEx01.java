
public class MethodEx01 {

	static void sum(int n) {
		int total = 0;
		for (int i = 1; i <= n; i++)
			total += i;
		System.out.println(total);
	}
	static void sum2(int count) {
		int sum = 0, i = 0;
		while(i++ < count)
			sum += i;
		System.out.println(sum);
	}
	public static void main(String[] args) {

		sum(10);
		sum2(100);
	}

}
