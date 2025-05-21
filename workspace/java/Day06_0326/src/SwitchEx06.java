import java.util.Scanner;

public class SwitchEx06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("1월부터 12월 사이 월을 입력하세요>> ");
		int month = Integer.parseInt(sc.nextLine());
		if(1 <= month && month <= 12) {
			switch (month) {
				case 3:case 4:case 5: System.out.println("봄입니다.");
				break;
				case 6:case 7:case 8: System.out.println("여름입니다.");
				break;
				case 9:case 10:case 11: System.out.println("가을입니다.");
				break;
				case 12:case 1:case 2: System.out.println("겨울입니다.");
			}
		}
		else {
			System.out.println("1월부터 12월 사이 월을 입력하세요");	
		}
	}

}
