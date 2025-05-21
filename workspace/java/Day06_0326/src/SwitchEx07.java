import java.util.Scanner;

public class SwitchEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1월부터 12월 사이 월을 입력하세요>> ");
		int month = Integer.parseInt(sc.nextLine());
		if(1 <= month && month <= 12) {
			/* if else if와 ||를 이용하여 날씨를 구하는 코드를 만들어보자.
			 */
			if(month == 3 || month == 4 || month == 5) System.out.println("봄입니다.");
			else if(month == 6 || month == 7 || month == 8) System.out.println("여름입니다.");
			else if(month == 9 || month == 10 || month == 11) System.out.println("가을입니다.");
			else System.out.println("겨울입니다.");
		}
		else System.out.println("1월부터 12월 사이 월을 입력하세요");	
	}

}
