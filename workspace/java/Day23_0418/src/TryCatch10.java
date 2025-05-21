
public class TryCatch10 {

	public static void main(String[] args) {

		int number = 100;
		int result = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				result= number/(int)(Math.random()*10);
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("0일 때 발생");
			}
		}
	}

}
