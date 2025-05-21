/* 문자열값 비교
 * 1. String 내장 API클래스의 equals()메스드는 값 자체를 비교한다.
 * 2. 비교 연산자 == 는 객체 주소를 비교한다.
 */
public class EqualsEx01 {

	public static void main(String[] args) {
		
		String str01 = "1234";
		String str02 = new String("1234");
		//객체 주소 비교
		System.out.printf("\"abc\" == \"abc\" ? %b\n", "abc" == "abc");
		System.out.printf("str01==\"1234\" ? %b\n", str01 == "1234");
		System.out.printf("str02==\"1234\" ? %b\n", str02 == "1234");
		
		//객체 값 비교
		System.out.printf("str01.eqauls(\"1234\") ? %b\n", str01.equals("1234"));
		System.out.printf("str02.eqauls(\"1234\") ? %b\n", str02.equals("1234"));
		System.out.println(str01.equals(str02));
		
		String str03 = new String("abc");
		System.out.println(str03.equals("ABC"));
		//대소문자 무시하고 같은지 비교
		System.out.println(str03.equalsIgnoreCase("ABC"));
	}

}
