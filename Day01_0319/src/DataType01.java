
public class DataType01 {
	/* public 키워드: 접근 권한 제어자 -> 누구나 접근 가능
	 * class 키워드: 클래스명 정의
	 */
	public static void main(String[] args) {
		/* static 키워드: 클래스명으로 직접 접근하는 정적메서드 정의
		 * void 예약어: 반환 타입 없음
		 * String[]: 문자열 배열
		 */
		//System.out: 모니터 출력장치와 연결
		System.out.println(10); //int
		System.out.println(10.5); //double
		System.out.println('a'); //char - 십진수 정수 형태로 저장
		System.out.println(true); //boolean
		System.out.println(10L); //long - 8byte
		System.out.println(10.3f); //float - 4byte
		System.out.println("seoul"); //String
	}
}
