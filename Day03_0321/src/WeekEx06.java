import java.util.Scanner;

public class WeekEx06 {

	public static void main(String[] args) {
		
		boolean res = false;
		res = (true && true);
		System.out.printf("%b && %b: %b", true, true, res);
		
		res = (false || false);
		System.out.printf("!%b : %b", false, !res);
		
		Scanner sc = new Scanner(System.in);
		String result = "";
		
		System.out.print("나이 입력>> ");
		int age = Integer.parseInt(sc.nextLine());
		
		result = (20 <= age && age <= 29) ? "20대" : "20대가 아님";
		System.out.println(result);
	}

}
