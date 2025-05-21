package 람다식;

public class RunnableExample {

	public static void main(String[] args) {

		Runnable run = () -> {
			for (int i = 10; i >= 1; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		};
		Thread th = new Thread(run);
		th.start();
		
		Thread th02 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				
			}
		});
		th02.start();
	}

}
