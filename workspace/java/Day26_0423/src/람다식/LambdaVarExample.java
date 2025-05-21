package 람다식;

@FunctionalInterface
interface Greeting {
	void greet(String name);
}
public class LambdaVarExample {

	public static void main(String[] args) {

		Greeting greeting = (var name) -> {
			System.out.println("Hello, "+name);
		};
		greeting.greet("홍길동");
		
		Greeting greeting2 = (var name) -> System.out.println("안녕하세요."+name);
		greeting2.greet("신사임당님");
 	}

}
