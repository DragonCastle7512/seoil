/* printf()매서드와 함께 사용하는 출력 지시자 종류
 * %b(boolean), %d(10진수 정수), %o(8진수 정수), %x(16진수 정수)
 * %f(10진수 실수), %e(지수형태), %c(문자), %s(문자열)
 */
public class VarTest06 {

	public static void main(String[] args) {
		
		char c = 'A';
		System.out.printf("c=%c, d=%d %n", c, (int)c);
		int octName = 010;
		System.out.printf("octName=%o, %d\n", octName, octName);
		int haxNum = 0x10;
		System.out.printf("haxNum=%x, %d\n", haxNum, haxNum);
		int binNum = 0b10;
		System.out.printf("binNum=%s, %d\n", Integer.toBinaryString(binNum), binNum);
	}

}
