package 중첩클래스와중첩인터페이스;

public class Anonymous {

	Person field = new Person() {
		void work() {
			System.out.println("출근을 합니다.");
		}
		
		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	void method() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("아침 산책");
			}
			@Override
			public void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}
	void method02(Person person) {
		person.wake();
	}
}
