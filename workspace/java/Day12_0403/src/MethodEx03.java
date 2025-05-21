import java.util.Scanner;

public class MethodEx03 {

	static int abs(int n) {
		return (n < 0) ? -n : n;
	}
	static void abs2(int n) {
		if(!(n < 0)) System.out.println("양의 정수 입력");
		else {
			n = -n;
			System.out.println("절대값: "+n);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("음의 정수를 입력>> ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println(abs(num));
		abs2(Integer.parseInt(args[0]));
		
		sc.close();
	}

}
