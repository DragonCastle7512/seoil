package Test;

public class Problem03 {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++)
			if(i%4 == 0) sum += i;
		System.out.println(sum);
		
	}

}
