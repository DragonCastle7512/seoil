import java.util.Scanner;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		boolean flag = true;
		System.out.println("누적합을 구할 숫자(종료하려면 0을 입력): ");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());
			if(input != 0) sum += input;
			else flag = false;
			sc.close();
		}
		System.out.println("누적합계: "+sum);
		
	}

}
