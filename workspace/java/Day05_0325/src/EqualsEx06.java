import java.util.Scanner;

public class EqualsEx06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요>> ");
		String inputA = scan.nextLine();
		int x = Integer.parseInt(inputA);
		if(x > 0) {
			if(x%2 == 0) {
				System.out.println("a는(은) 짝수이다.");
			}
			else {
				System.out.println("a는(은) 홀수이다.");
			}
		}
		else {
			System.out.println("양의 정수만 입력하세요!");
		}
	}

}
