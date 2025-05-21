/* 제네릭 와일드 카드
 * <? super Integer> : Integer 타입의 조상만 제네릭 타입간의 형변환을 제한적 허용
 */

import java.util.Arrays;
import java.util.List;

public class GenericWild01 {
	static void addNumber(List<? super Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(" "+list.get(i));
		}
		System.out.println("\n===========================");
	}
	public static void main(String[] args) {

		Number[] arr = {10, 20, 30};
		Object[] arr2 = {1000, 2000, 3000};
		List<Number> li = Arrays.asList(arr);
		addNumber(li);
		
		List<Object> li02 = Arrays.asList(arr);
		addNumber(li02);
	}

}
