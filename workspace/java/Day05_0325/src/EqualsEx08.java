import java.util.Scanner;

public class EqualsEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력>> ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("정수값 입력>> ");
		int b = Integer.parseInt(sc.nextLine());
		if(a > 0) System.out.println(a+"는 양수이다.");
		else if(a < 0) System.out.println(a+"는 음수이다.");
		else System.out.println(a+"는 0이다.");
	}

}
