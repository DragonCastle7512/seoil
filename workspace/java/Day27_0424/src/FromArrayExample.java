import java.util.*;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {

		String[] s = {"홍길동", "이순신", "강감찬"};
		Stream<String> stream = Arrays.stream(s);
		stream.forEach(System.out::println);
		System.out.println("\n================");
		
		int[] intArray = {20, 30, 10};
		Arrays.stream(intArray).map(x -> x*2).forEach(x -> System.out.print(x+" "));
		intArray = Arrays.stream(intArray).map(x -> (int)Math.pow(x, 2)).sorted().toArray();
		System.out.println();
		Arrays.stream(intArray).forEach(System.out::println);
	}

}
