import java.util.Scanner;

public class SwitchEx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력(991225-1888212)>> ");
		String jumin = sc.nextLine();
		char juNo = jumin.charAt(7);
		switch (juNo) {
			case '1': case '3':
				switch (juNo) {
				 case '1': System.out.println("당신은 2000년 이전 태어난 남자입니다."); break;
				 case '3': System.out.println("당신은 2000년 이후 태어난 남자입니다."); break;
				}
				break;
			case '2': case '4':
				switch (juNo) {
					case '2' : System.out.println("당신은 2000년 이전 태어난 여자입니다."); break;
					case '4' : System.out.println("당신은 2000년 이후 태어난 여자입니다."); break;
				}
				break;
		}
	}

}
