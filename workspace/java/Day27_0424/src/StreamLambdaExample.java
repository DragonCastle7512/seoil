import java.util.Arrays;
import java.util.List;

public class StreamLambdaExample {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(
			new Student("홍길동", 100),
			new Student("신사임당", 96),
			new Student("강감찬", 88)
		);
		double avg = list.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		int sum = list.stream()
				.mapToInt(Student::getScore)
				.sum();
		System.out.println(avg);
		System.out.println(sum);
	}

}
