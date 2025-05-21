import java.util.Scanner;

public class BreakEx08 {

	public static void main(String[] args) {
		
		int menu = 0;
		int price = 0;
		Scanner sc = new Scanner(System.in);
		
		outer:
		while(true) {
			System.out.println("1- 물냉면");
			System.out.println("2- 비빔냉면");
			System.out.println("3- 삼계탕");
			System.out.println("원하는 여름음식 메뉴(1~3)번호를 선택하세요. (종료:0)>> ");
			menu = Integer.parseInt(sc.nextLine());
			if(menu == 0) break;
			else if(!(1 <= menu && menu <= 3)) {
				System.out.println("잘못된 번호입니다.");
				continue;
			}
			for (;;) {
				System.out.print("계산할 값 입력(계산종료 0, 전체 종료 99)>>");
				price = Integer.parseInt(sc.nextLine());
				if(price == 0) break;
				else if(price == 99) break outer;
				switch (menu) {
					case 1: System.out.println("물냉면 값="+price); break;
					case 2: System.out.println("비빔냉면 값="+price); break;
					case 3: System.out.println("삼계탕 값="+price); break;
				}
			}
		}
		System.out.println("여름음식 선택 메뉴판을 종료합니다.");
	}

}
