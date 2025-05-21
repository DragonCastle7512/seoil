
public class TryCatch07 {

	public static void main(String[] args) {

		int[] score = {1, 2, 3};
		try {
			System.out.println("Test - 1");
			score[4] = 5;
			System.out.println("Test - 2");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
