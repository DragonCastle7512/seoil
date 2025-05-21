
public class InterEx08 {

	public static void main(String[] args) {

		int a = 10, b = 10;
		System.out.println((a==b) ? "같다" : "다르다");
		
		String pwd01 = new String("56789");
		String pwd02 = new String("56789");
		System.out.println((pwd01==pwd02) ? "같다" : "다르다");
		
		System.out.println(pwd01.equals(pwd02) ? "같다" : "다르다");
	}

}
