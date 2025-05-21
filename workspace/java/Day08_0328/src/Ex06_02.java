import java.util.Scanner;

public class Ex06_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력>> ");
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 1; i <= n; i++) {
			if(i%2 == 1) System.out.print(i+" ");
		}
		System.out.println();
		for (int i = 1; i <= n; i+=2)
			System.out.print(i+" ");
		sc.close();
	}

}
