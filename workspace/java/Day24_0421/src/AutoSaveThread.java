
public class AutoSaveThread extends Thread {

	public void save() {
		System.out.println("저장");
	}
	@Override
	public void run() {
		while (true) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {}
			save();
		}
	}
}
