import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {

		//0.0이상 1.0미만 사이의 실수 숫자 난수 발생
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1부터 100사이의 임의의 정수 입력>> ");
			input = Integer.parseInt(sc.nextLine());
			if(input > answer) {
				System.out.println("더 작은 숫자를 입력하세요.");
			}
			else if(input < answer) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}
		} while (input != answer);
		System.out.println("정답입니다!");
		
		sc.close();
	}

}
