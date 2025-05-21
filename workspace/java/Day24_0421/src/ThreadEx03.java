/* 2번째 멀티스레드 구현법
 * 1. Runnable 인터페이스 구현(다중 상속 가능)
 * 2. 단점은 Runnable을 구현 상속한 자손 클래스 객체로 start() 메서드 호출 불가
 * 3. 그래서 Thread 생성자 인자값으로 전달하여 start() 메서드를 호출해야한다.
 */
class Thread03 implements Runnable {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < 100000000; j++);
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {

		Thread03 t01 = new Thread03();
		Thread03 t02 = new Thread03();
		Thread th01 = new Thread(t01, "첫번째 스레드");
		Thread th02 = new Thread(t02, "두번째 스레드");
		
		th01.start();
		th02.start();
	}

}
