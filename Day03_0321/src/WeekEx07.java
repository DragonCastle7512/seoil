import java.util.Scanner;

public class WeekEx07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문 단일문자 입력>> ");
		char ch = sc.next().charAt(0);
		System.out.println("\'"+(('a' <= ch && ch <= 'z') ? "소문자" : "대문자")+"\'입니다.");
		
		sc.close();
	}

}
