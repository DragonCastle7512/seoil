
public class OprEx07 {

	public static void main(String[] args) {
		
		byte a = 10;
		byte b = 20;
		//byte의 범위를 넘었기에 int로 자동 형변환됨
		byte c = (byte)(a+b);
		System.out.printf("%d + %d = %d\n", a, b, c);
		int d = a+b;
		System.out.println(a+" + "+b+" = "+d);
		System.out.println("\n ==================> \n");
		
		a = 10;
		b = 30;
		c = (byte)(a*b);
		System.out.printf("%d * %d = %d\n", a, b, c);
	}

}
