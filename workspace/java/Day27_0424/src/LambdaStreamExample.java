import java.util.*;
import java.util.stream.Stream;

public class LambdaStreamExample {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
			new Student("홍길동", 100),
			new Student("신사임당", 99)
		);
		Stream<Student> stream = list.stream();
		stream.forEach(s-> System.out.println(s.getName()+" "+s.getScore()));
	}

}
