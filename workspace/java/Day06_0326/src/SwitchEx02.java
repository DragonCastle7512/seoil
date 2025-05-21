import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/* 문제) 정수숫자를 입력받고 0을 입력했을때 "입력하신 숫자는 0입니다!" 
		 * 아닐때 "입력하신 숫자는 0이 아닙니다!" 라고 출력
		 */
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine());
		if(a == 0) System.out.println("입력하신 숫자는 0입니다!");
		if(a != 0) System.out.println("입력하신 숫자는 0이 아닙니다!");
	}

}
