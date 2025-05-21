
public class TryCatch08 {

	static void exp(int a) throws NullPointerException {
		if(a == 0) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {

		try {
			System.out.println("예외 발생 전");
			exp(0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
