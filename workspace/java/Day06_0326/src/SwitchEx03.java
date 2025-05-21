import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 숫자 입력>> ");
		int a = Integer.parseInt(sc.nextLine());
		if(a == 0) System.out.println("입력하신 숫자는 0입니다!");
		else System.out.println("입력하신 숫자는 0이 아닙니다!");
	}

}
