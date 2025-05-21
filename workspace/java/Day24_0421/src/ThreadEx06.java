import javax.swing.JOptionPane;

class Thread06 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx06 {

	public static void main(String[] args) {

		Thread06 th = new Thread06();
		th.start();
		
		String cityName = JOptionPane.showInputDialog("도시이름 입력:");
		System.out.println("입력한 도시이름: "+cityName);
	}

}
