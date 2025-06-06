class Account {
	private int balance = 1000;
		
	public int getBalance() {
		return balance;
	}
	public void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}
}
class RunnableEx01 implements Runnable {
	Account acc = new Account();
	@Override
	public void run() {
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;
			acc.withdraw(money);
			System.out.println("출금 후 잔액: "+acc.getBalance());
		}
	}
}
public class TwoEx01 {

	public static void main(String[] args) {

		Runnable r = new RunnableEx01();
		new Thread(r).start();
		new Thread(r).start();
	}

}
