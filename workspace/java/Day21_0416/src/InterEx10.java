import java.util.StringTokenizer;

public class InterEx10 {

	public static void main(String[] args) {

		String phoneNumber = "010-7777-7777";
		StringTokenizer phone = new StringTokenizer(phoneNumber, "-");
		String phone01 = phone.nextToken();
		String phone02 = phone.nextToken();
		String phone03 = phone.nextToken();
		
		System.out.println(phone01);
		System.out.println(phone02);
		System.out.println(phone03);
		System.out.println("\n=================");
		
		StringTokenizer phone2 = new StringTokenizer(phoneNumber, "-");
		while(phone2.hasMoreElements())
			System.out.println(phone2.nextToken());
	}

}
