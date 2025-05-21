package 중첩클래스와중첩인터페이스;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method();
		
		anony.method02(
			new Person() {
				void study() {
					System.out.println("공부합니다.");
				}
				@Override
				public void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				};
			}
		);
	}

}
