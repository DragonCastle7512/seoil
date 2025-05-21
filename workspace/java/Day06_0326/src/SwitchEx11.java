/* java 17버전까지는 switch~case문의 표현값이 null인 경우 예외 오류 발생
 * java 21버전부터는 예외 오류가 발생하지 않음
 */
public class SwitchEx11 {

	private static void method01(String s) {
		switch (s) {
			case null -> System.out.println("null");
			case "a","b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			default -> System.out.println("해당 사항 없음");
		}
	}
	private static void method02(String s) {
		switch (s) {
			case "a","b" -> System.out.println("a or b");
			case "c" -> System.out.println("c");
			case null, default -> System.out.println("(null) or 해당 사항 없음");
		}
	}
	public static void main(String[] args) {
		method01("a");
		method02("c");
	}

}
