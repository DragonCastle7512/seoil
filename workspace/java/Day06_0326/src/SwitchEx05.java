import java.util.Scanner;

public class SwitchEx05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char grade = ' ';
		char opr = ' ';
		System.out.println("0부터 100사이의 정수>> ");
		int score = Integer.parseInt(sc.nextLine());
		if(!(0 <= score && score <= 100))
			System.out.println("0부터 100사이의 정수를 입력하세요");
		else {
			if(score >= 90) {
				grade = 'A';
				if(score >= 96) opr = '+';
			}
			else if(score >= 80) {
				grade = 'B';
				if(score >= 86) opr = '+';
			}
			else if(score >= 70) {
				grade = 'C';
				if(score >= 76) opr = '+';
			}
			else if(score >= 60) {
				grade = 'D';
				if(score >= 66) opr = '+';
			}
			else grade = 'F';
			System.out.println("당신의 학점은 "+grade+""+opr+"입니다.");
		}
	}

}
