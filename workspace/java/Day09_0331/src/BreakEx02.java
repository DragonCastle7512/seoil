
public class BreakEx02 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i%3 == 0) break;
				System.out.print(" j->"+j);
			}
			System.out.println("\n i->"+i);
		}
		System.out.println("\n=======================");
		exit_for:
			for (int i = 1; i < 10; i++) {
				for (int j = 1; j <= 10; j++) {
					if(i%3 == 0) break exit_for;
					System.out.print(" j->"+j);
				}
				System.out.println("\n i->"+i);
			}
	}

}
