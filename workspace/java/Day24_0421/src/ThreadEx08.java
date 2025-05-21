import javax.swing.JOptionPane;

class Thread08 extends Thread {
	@Override
	public void run() {
		int i = 10;
		//isInterrupted -> interupted 여부 boolean 타입으로 반환
		while(i != 0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//InterruptedException가 발생하면서 interrupted 상태를 false로 초기화시킴
				interrupt();
			}
		}
		System.out.println("종료");
	}
}
public class ThreadEx08 {

	public static void main(String[] args) throws Exception {

		Thread08 th = new Thread08();
		th.start();
		String name = JOptionPane.showInputDialog("이름 입력");
		System.out.println("입력한 이름: "+name);
		th.interrupt();
		System.out.println("isInterrupted() = "+th.isInterrupted());
	}

}
