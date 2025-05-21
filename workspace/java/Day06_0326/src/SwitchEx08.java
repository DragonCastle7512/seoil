import java.util.Scanner;

public class SwitchEx08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("샘플 주민 번호 입력(011231-4080212)>> ");
		String jumin = sc.nextLine();
		char regNo = jumin.charAt(7);
		switch (regNo) {
			case '1':
			case '3': System.out.println("당신은 남자입니다."); break;
			case '2':
			case '4': System.out.println("당신은 여자입니다."); break;
			default : System.out.println("유효하지않은 주민번호입니다.");
		}
	}

}
