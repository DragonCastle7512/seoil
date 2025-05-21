import java.util.Scanner;

public class EqualsEx07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번쨰 정수값 입력>> ");
		int a = Integer.parseInt(scan.nextLine());
		System.out.print("두번쨰 정수값 입력>> ");
		int b = Integer.parseInt(scan.nextLine());
		
		int max = 0;
		int min = 0;
		if(a>b) {
			max = a;
			min = b;
		}
		else {
			max = b;
			min = a;
		}
		System.out.printf("최대값=%d\n", max);
		System.out.printf("최소값=%d\n", min);
	}

}
