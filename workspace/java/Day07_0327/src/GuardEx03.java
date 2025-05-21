
public class GuardEx03 {

	private static void method01(Integer obj) {
		switch (obj) {
			case 0 -> System.out.println(0);
			case Integer i when i > 0 -> System.out.println("양수이다.");
			case Integer i -> System.out.println("음수이다.");
		}
	}
	private static class A {
		
	}
	private static class B extends A {
		
	}
	private static void method02(Object obj) {
		switch (obj) {
			case B b -> System.out.println("obj is B type");
			case A a -> System.out.println("obj is A type");
			case null, default -> System.out.println("null or unknown type");
		}
	}
	public static void main(String[] args) {
		method01(10);
		method01(-10);
		method02(new A());
	}

}
