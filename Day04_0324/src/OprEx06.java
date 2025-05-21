
public class OprEx06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		int result = a-b;
		System.out.println(a+" - "+b+" = "+result);
		
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		/* 문제) int 타입 b변수값을 형변환 해서 나눗셈한 결과를 
		 * 소수점 6자리 이하까지 printf()를 사용하여 출력하시오.
		 */
		System.out.printf("%d / %.1f = %f", a, (float)b, a/(float)b);
	}

}
