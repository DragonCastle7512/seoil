import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		Function<Integer, Member> function = Member::new;
		Member member = function.apply(7);
		
		BiFunction<String, Integer, Member> function2 = Member::new;
		Member member2 = function2.apply("홍길동", 25);
	}

}
