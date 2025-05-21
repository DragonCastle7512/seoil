
public class GuardEx05 {

	public static void main(String[] args) {

		int n = 7;
		for (int i = 1; i <= 9; i++)
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		System.out.println("===================");
		
		int sum = 0;
		for (int i = 1; i <= 10; i++)
			sum += i;
		System.out.println("1부터 10까지의 누적합 "+sum);
	}

}
