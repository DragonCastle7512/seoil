import java.util.Scanner;

public class GuardEx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("#을 출력할 라인 수>> ");
		int line = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" #");
			System.out.println();
		}
	}

}
