/* 입력을 받기 위한 내장 api - java.util.Scanner
 * import 단축키 ctrl+shift+o
 */
import java.util.Scanner;

public class VarTest07 {

	public static void main(String[] args) {
		
		//System.in -> 키보드 입력 장치와 연결
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력>>");
		//문자열로 입력받고 정수로 변환
		int age = Integer.parseInt(sc.nextLine());
		System.out.println(age);
		
		sc.close();
	}

}
