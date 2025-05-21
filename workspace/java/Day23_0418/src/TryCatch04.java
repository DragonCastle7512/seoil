
public class TryCatch04 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, result = 0;
		try {
			System.out.println("(1)result = "+(result = a/b02));
			System.out.println("(2)result = "+(result = a/b01));
		} catch (ArithmeticException e) {
			System.out.println("예외 발생"+e);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
