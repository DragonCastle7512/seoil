import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문나라 이름 입력");
		String country = sc.nextLine();
		char first = country.charAt(0);
		switch (first) {
			case 'k':
			case 'K': System.out.println("대한민국"); break;
			case 'a':
			case 'A': System.out.println("미국"); break;
			case 'c':
			case 'C': System.out.println("캐나다"); break;
			case 'j':
			case 'J': System.out.println("일본"); break;
			default: System.out.println("해당하는 나라 없음");
		
		}
	}

}
