/* java 12버전에서 switch~case 다중 선택문에 표현식 문법 -> 연산자가 추가
 * java 13버전에서 yield 키워드가 추가되어서 반환값을 지정할 수 있게 되었다.
 */
public class SwitchEx10 {

	public static void main(String[] args) {
		
		/* 1. switch~case문에 화살표 연산자 ->를 사용하면 코드가 좀 더 간결해진다. 
		 * 이를 통해 값을 반환해서 변수를 초기화할 수 있다.
		 */
		int day = 2;
		String dayName = switch(day) {
			case 1 -> "월요일";
			case 2 -> "화요일";
			case 3 -> "수요일";
			default -> "알 수 없는 요일";
		};
		System.out.println("반환된 요일: "+dayName);
		
		System.out.println("\n=================> \n");
		var day02 = 1;
		/* 1. java 10버전에서 도입된 var 키워드는 선언되는 지역변수 타입을 추론할 수 있다.
		 * 2. java 13버전에서 도입된 yield 키워드는 switch~case 블록내에서 반환값을 명시적으로 지정할 수 있게 해준다.
		 * 이 때 반드시 default문이 있어야한다.
		 */
		String dayName2 = switch (day02) {
			case 1 -> {
				String name = "월요일";
				yield name;
			}
			case 2 -> "화요일";
			case 3 -> "수요일";
			default -> "알 수 없음";
		};
		System.out.println("반환된 요일 "+dayName2);
	}

}
