
public class GuardEx06 {

	public static void main(String[] args) {

		int i = 0;
		for (i = 10; i >= 1; i-=2)
			System.out.print(" "+i);
		
		System.out.println();
		i = 2;
		while(i <= 10) {
			System.out.print(" "+i);
			i += 2;
		}
		System.out.println();
		
		int sum = 0;
		i = 10;
		while(i > 2) {
			sum += i;
			i -= 2;
		}
		System.out.println("짝수들의 누적합="+sum);
	}

}
