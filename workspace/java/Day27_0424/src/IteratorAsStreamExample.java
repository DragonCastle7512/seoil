import java.util.*;
import java.util.stream.*;

public class IteratorAsStreamExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("홍길동", "신사임당", "을지문덕");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		list.stream().forEach(name -> System.out.println(name));
		list.stream().forEach(System.out::println);
	}

}
