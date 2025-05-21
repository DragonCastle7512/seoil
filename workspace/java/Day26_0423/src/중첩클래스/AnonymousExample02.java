package 중첩클래스;

public class AnonymousExample02 {

	public static void main(String[] args) {

		Anonymous02 anony = new Anonymous02();
		anony.field.turnOn();
		anony.method01();
		anony.method02(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("구글 유튜브를 켭니다.");
			}
			
			@Override
			public void turnOff() {
				System.out.println("구글 유튜브를 끕니다.");
			}
		});
	}

}
