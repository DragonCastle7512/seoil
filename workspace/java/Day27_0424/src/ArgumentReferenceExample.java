import java.util.function.ToIntBiFunction;

public class ArgumentReferenceExample {

	public static void main(String[] args) {

		ToIntBiFunction<String, String> function;
		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("java21", "Java21"));
		function = String::compareToIgnoreCase;
		print(function.applyAsInt("java21", "JAVA8"));
	}
	
	public static void print(int order) {
		if(order < 0) System.out.println("사전순으로 먼저 나옵니다.");
		else if(order == 0) System.out.println("동일한 문자열 입니다.");
		else System.out.println("사전순으로 나중에 나옵니다.");
	}

}
