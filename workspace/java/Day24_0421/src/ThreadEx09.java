/* 스케줄링 메서드의 suspend(), resume(), stop() 메서드는 교착 상태 발생으로 인해
 * @Deprecated 에노테이션으로 설정되어 있다.
 */
class Thread09 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx09 {

	public static void main(String[] args) {

		Thread09 t = new Thread09();
		Thread th01 = new Thread(t, "#");
		Thread th02 = new Thread(t, "##");
		Thread th03 = new Thread(t, "###");
		
		th01.start();
		th02.start();
		th03.start();
		try {
			Thread.sleep(2000);
			th01.suspend();
		} catch (InterruptedException e) {}
	}

}
