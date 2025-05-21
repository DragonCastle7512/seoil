import java.util.Scanner;

public class EqualsEx10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("관리자 등급 입력(6~9)>> ");
		int grade = Integer.parseInt(sc.nextLine());
		if (6 <= grade && grade <= 9) {
			switch (grade) {
				case 9: System.out.println("최고 관리자 등급입니다.");
				case 8: System.out.println("관리자 등급입니다.");
				case 7: System.out.println("중간 관리자 등급입니다.");
				case 6: System.out.println("사용자 등급입니다.");
			}
		}
		else {
			System.out.println("6~9사이의 등급만 입력하세요!");
		}
		
	}

}
