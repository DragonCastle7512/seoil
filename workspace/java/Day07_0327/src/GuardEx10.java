
public class GuardEx10 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.println(">>"+i+"단<<");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
		int k=2;
		while(k <= 9) {
			System.out.print(k+"단\t");
			k++;
		}
		System.out.println();
		for (int i = 0; i < 9; i++)
			System.out.print("=======");
		System.out.println();
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++)
				System.out.printf("%d*%d=%d\t", j, i, i*j);
			System.out.println();
		}
	}

}
