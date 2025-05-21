
public class OprEx10 {

	public static void main(String[] args) {
		
		char c01 = 'a';
		char c02 = c01;
		char c03 = ' ';
		int i = c01+1;
		System.out.printf("i=%d\n", i);
		c03 = (char)(c01+1);
		System.out.printf("c03=%c\n", c03);
		c02++;
		c02++;
		System.out.printf("c02=%c\n", c02);
	}

}
