/* 자바21에서 추가된 가상 스레드 생성법*/
public class TwoEx03 {

	public static void main(String[] args) {

		Thread.startVirtualThread(()-> {
			System.out.println("첫번째 가상 스레드");
		});
		Thread.ofVirtual().start(() -> {
			System.out.println("두번째 가상 스레드");
		});
		Thread virtualThread03 = Thread.ofVirtual()
					.name("download")
					.start(() -> {
						System.out.println("스레드 이름을 설정한 세번째 가상 스레드");
					});
		System.out.println("virtualThread03 스레드 이름: "+virtualThread03.getName());
	}

}
