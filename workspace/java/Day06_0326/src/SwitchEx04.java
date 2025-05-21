import java.util.Scanner;

public class SwitchEx04 {

	public static void main(String[] args) {

		char grade = ' ';
		Scanner sc = new Scanner(System.in);
		System.out.println("0부터 100사이의 수학 점수>> ");
		int score = Integer.parseInt(sc.nextLine());
		if(!(0 <= score && score <= 100)) {
			System.out.println("0부터 100사이의 수학 점수를 입력하세요");
		}
		else {
			if(90 <= score && score <= 100) grade = 'A';
			else if(80 <= score && score <= 90) grade = 'B';
			else if(70 <= score && score <= 80) grade = 'C';
			else if(60 <= score && score <= 70) grade = 'D';
			else grade = 'F';
			System.out.println(grade+"학점 입니다.");
		}

	}

}
