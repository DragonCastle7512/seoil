
public class BreakEx01 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++)
			System.out.print(" "+i);
		System.out.println("\n========================");
		
		for (int i = 1; i <= 10; i++) {
			if(i%4 == 0) break;
			System.out.print(" "+i);
		}
	}

}
