import java.util.Scanner;

public class Ex06_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력>> ");
		String s = sc.nextLine();
		System.out.print("정수 입력>> ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++)
			System.out.print(s);
		
		sc.close();
	}

}
