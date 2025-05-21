import java.util.Scanner;

public class EqualsEx11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int score = Integer.parseInt(input.nextLine());
		if(0 <= score && score <= 100) {
			char grade = ' ';
			switch (score/10) {
				case 10:
				case 9: grade = 'A'; break;
				case 8: grade = 'B'; break;
				case 7: grade = 'C'; break;
				case 6: grade = 'D'; break;
				default: grade = 'F';
			}
			System.out.println(grade+"학점 입니다.");
		}
		else {
			 System.out.println("0부터 100사이의 점수만 입력하세요!");
		}
		
	}

}
