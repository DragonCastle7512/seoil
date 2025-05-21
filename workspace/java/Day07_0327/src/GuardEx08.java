
public class GuardEx08 {

	public static void main(String[] args) {
		for (int i=1, j=10; i<=10; i++,j--)
			System.out.printf("%d\t %d\n", i, j);
		System.out.println("\n===============");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
