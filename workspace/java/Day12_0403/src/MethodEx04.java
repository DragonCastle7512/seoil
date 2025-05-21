import java.util.Scanner;

public class MethodEx04 {

	static void nameFunc(String name) {
		System.out.println("자기 이름: "+name);
	}
	static void gu(int n) {
		for (int i = 1; i <= 9; i++)
			System.out.printf("%d*%d = %d\n",n, i, i*n);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("자기 성이름 입력>> ");
		String name = sc.nextLine();
		nameFunc(name);
		
		System.out.println("출력할 구구단>> ");
		int gugu = Integer.parseInt(sc.nextLine());
		gu(gugu);
	}

}
