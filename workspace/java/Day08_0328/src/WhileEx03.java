
public class WhileEx03 {

	public static void main(String[] args) {
		
		int n = 10, odd = 0, even = 0;
		for (int i = 1; i <= n; i+=2)
			odd += i;
		for (int i = 2; i <= n; i+=2)
			even += i;
		System.out.println("홀수의 합: "+odd);
		System.out.println("짝수의 합: "+even);
		
		odd = even = 0;
		for (int i = 1; i <= n; i++) {
			if(i%2 == 1) odd += i;
			else even += i;
		}
		System.out.println("홀수의 합: "+odd);
		System.out.println("짝수의 합: "+even);
	}

}
