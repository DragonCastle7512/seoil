/* 멅티스레드 구현법
 * 1. Thread 클래스 상속
 * 2. run() 메소드를 오버라이딩 해서 스레드 문장을 구현
 * 3. Thread 클래스를 상속 받아서 자손에서 스레드 프로그램을 만들면 단순한 것 구현 가능. 단점은 단일 상속만 가능
 */
class Thread01 extends Thread {
	public Thread01(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			//스레드가 구현될 시간적 여유를 준다.
			for (int j = 1; j <= 100000000; j++);
			System.out.println(getName()+" : "+i);
		}
	}
}
public class ThreadEx01 {

	public static void main(String[] args) {

		Thread01 th01 = new Thread01("첫번째 스레드");
		Thread01 th02 = new Thread01("두번째 스레드");
		//실행 대기 상태에 있다가 자기 차례가 되면 run() 호출
		th01.start();
		th02.start();
	}

}
