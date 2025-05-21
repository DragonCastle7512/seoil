/* 다중 조건문에서 레이블 패턴이 사용되면 break 없으면 통과됨
 * 단, 다음 조건이 default 라면 가능
 * 화살표 연산은 break가 없어도 통과되지 않음
 */

import java.lang.reflect.Method;

public class GuardEx02 {

	public static void method01(Object obj) {
		switch (obj) {
			case String s:
				System.out.println("String : "+s);
				break;
			case Integer i:
				System.out.println("Integer i : "+i);
			case null, default:
				System.out.println("null or unknown");
		}
	}
	public static void method02(Object obj) {
		switch (obj) {
			case String s -> System.out.println("String s: "+s);
			case Integer i -> System.out.println("Integer i: "+i);
			case null, default -> System.out.println("null or unknown");
		}
	}
	public static void main(String[] args) {
		method01("seoul");
		System.out.println();
		method01(7);
		System.out.println();
		method02(7);
		
	}

}
