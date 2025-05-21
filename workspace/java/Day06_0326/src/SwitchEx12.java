/* 자바 21버전 새롭게 추가된 패턴 매칭
 * switch 레이블에 패턴을 작성해서 표현값과 매칭을 시킬 수 있다. 
 * 이 방식은 표현값이 레퍼런스 참조 변수일 경우에만 사용할 수 있다.
 * 
 * 표현값과 레이블 패턴 중 하나는 반드시 매칭 되어야한다. 
 * 매칭할 패턴이 없는 경우 default 문을 포함해야한다.
 */

import java.util.Date;

public class SwitchEx12 {

	public static void method01(Object obj) {
		switch (obj) {
			case Integer i -> System.out.println(i);
			case String s -> System.out.println("\""+s+"\"");
			case null, default -> System.out.println("null or 해당없음");
		}
	}
	public static void method02(Object obj) {
		String result = switch(obj) {
			case Integer i -> String.valueOf(i);
			case String s -> "\""+ s+"\"";
			case null, default -> "unknown";
		};
		System.out.println(result);
	}
	public static void main(String[] args) {
		method01(100);
		method01("100");
		method01(null);
		method01(new Date());
		
		System.out.println("\n ==================> \n");
		
		method02(10);
		method02("10");
		method02(null);
		method02(new Date()); // 업캐스팅
	}

}
