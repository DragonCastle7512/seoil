
public class GuardEx12 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j) System.out.printf("[%d %d]", i, j);
				else System.out.printf("%c", ' ');
			}
			System.out.println();
		}
	}

}
