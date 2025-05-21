
public class TryCatch05 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, result = 0;
		
		try {
			System.out.println("(1)result = "+(result = a/b02));
			System.out.println("(2)result = "+(result = a/b01));
			System.out.println("(3)result = "+(result = a/b02));
		} catch (ArithmeticException e) {
			System.out.println("예외 발생"+e);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("마지막에 무조건 실행");
		}
	}

}
