
public class TryCatch03 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, c = 10;
		System.out.println("try구문 실행전 c = "+c);
		try {
			c = a/b02;
			System.out.println("(1)c = "+c);
			
			c = a/b01;
			System.out.println("(2)c = "+c);
			
			c = a/b02;
			System.out.println("(3)c = "+c);
		} catch (Exception e) {
			System.out.println("예외 발생: "+e);
		}
		System.out.println("try 구문 실행후 c = "+c);
	}

}
