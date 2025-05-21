import java.util.Scanner;

public class WeekEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수값 입력>> ");
		String inputNumber01 = sc.nextLine();
		int a = Integer.parseInt(inputNumber01);
		
		System.out.print("두번째 정수값 입력>> ");
		String inputNumber02 = sc.nextLine();
		int b = Integer.parseInt(inputNumber02);
		
		int max = (a>b) ? a : b;
		System.out.println(a+" 와 "+b+"중에 더 큰 수는: "+max);
		
		sc.close();
	}

}
