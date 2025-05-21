class UserException extends Exception {
	public UserException(String msg) {
		super(msg);
	}
}
public class TryCatch09 {

	public static void main(String[] args) {

		try {
			int a = -11;
			if(a <= 0) throw new UserException("양수가 아닙니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
