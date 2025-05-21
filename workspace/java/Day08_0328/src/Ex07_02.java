
public class Ex07_02 {

	public static void main(String[] args) {

		int sum = 1;
		for (int i = 1; i <= 100; i++, sum+=i)
			if(i%10 == 0) System.out.println("1~"+i+" 까지의 합 -> "+sum);
		
		System.out.println();
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++)
				sum += (i-1)*10+j;
			System.out.println("1~"+i*10+" 까지의 합 -> "+sum);
		}
	}

}
