
public class GuardEx01 {
	
	public static void method01(Object obj) {
		int score = switch (obj) {
			case Integer i when i == 1 -> 90;
			case Integer i when i == 2 -> 80;
			case Integer i -> 70;
			case String s when s.equals("a") -> 90;
			case String s when s.equals("b") -> 80;
			case String s -> 70;
			case null, default -> 0;
		};
		System.out.println("score = "+score);
	}
	public static void main(String[] args) {
		method01(1);
		method01(2);
		method01(3);
		System.out.println("\n");
		method01("a"); method01("b"); method01("c"); method01(null);
	}

}
