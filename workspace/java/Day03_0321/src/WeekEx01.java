/* 캐스팅 형변환과 음의 정수 -> 2진수 변환
 */
public class WeekEx01 {

	public static void main(String[] args) {
		
		int i = 10;
		byte b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d%n", i, b);
		i = 300;
		//자료손실 발생
		b = (byte)i;
		System.out.printf("[int -> byte] i=%d -> b=%d\n", i, b);
		i = -2;
		System.out.println("10진수 -> 2진수="+Integer.toBinaryString(b));
		/* 자바의 자동 산술법
		 * 작은 타입 -> 큰 타입(자동 형변환 값 손실이 없기 때문에)
		 * byte -> short -> char -> int -> long -> float -> double
		 * ex) 1(int)+0.5(double) = 1.5(double)
		 */
	}

}
