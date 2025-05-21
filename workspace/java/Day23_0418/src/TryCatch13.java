public class TryCatch13 {

	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(7/0);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
		} catch (Exception e) {
			System.out.println("Exception");
		}
		System.out.println(6);
	}

}
