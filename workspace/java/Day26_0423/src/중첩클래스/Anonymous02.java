package 중첩클래스;

public class Anonymous02 {
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	void method01() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	void method02(RemoteControl rc) {
		rc.turnOn();
	}
}
