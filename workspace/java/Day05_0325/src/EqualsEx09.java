import java.util.Scanner;

public class EqualsEx09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 사이의 점수 입력>> ");
		int score = Integer.parseInt(scan.nextLine());
		System.out.print(score+"점은 ");
		char grade = ' ';
		if(0 <= score && score <= 100) {
			if(90 <= score && score <= 100) grade = 'A';
			else if(80 <= score && score <= 89) grade = 'B';
			else if(70 <= score && score <= 79) grade = 'C';
			else if(60 <= score) grade = 'D';
			else grade = 'F';
			System.out.println(grade+"학점입니다.");
		}
		else System.out.println("0~100사이의 점수를 입력하세요!");
	}

}
