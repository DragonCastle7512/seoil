import java.util.Scanner;

public class BreakEx07 {

	public static void main(String[] args) {

		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1- 치킨");
			System.out.println("2- 오뎅탕");
			System.out.println("3- 장충동 족발");
			System.out.println("원하는 야식메뉴(1~3)를 선택하세요. (종료:0)>> ");
			menu = Integer.parseInt(sc.nextLine());
			if(menu == 0) break;
			else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하였습니다.");
				continue;
			}
			System.out.println("선택한 메뉴 번호는 "+menu+"번입니다.");
		}
		System.out.println("야식 메뉴 선택 프로그램을 종료합니다.");
	}

}
