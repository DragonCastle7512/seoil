import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	final static String[] infor = {"이름", "전화번호", "이메일"};
	static void printMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("전화번호부 메뉴:\n");
		String[] s = {"추가", "보기", "수정", "삭제"};
		for (int i = 0; i < s.length; i++)
			sb.append(i+1).append(". 연락처 ").append(s[i]).append("\n");
		sb.append("5. 종료");
		System.out.println(sb);
	}
	static Contact creatContact() {
		String[] s = new String[infor.length];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < infor.length; i++) {
			System.out.print(infor[i]+"입력: ");
			s[i] = sc.nextLine();
		}
		sc.close();
		return new Contact(s[0], s[1], s[2]);
	}
	static void lookContact(List<Contact> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			Contact c = list.get(i);
			String[] s = {c.getName(), c.getPhoneNum(), c.getEmail()};
			for (int j = 0; j < infor.length; j++)
				sb.append(infor[j]).append(": ").append(s[j]).append(" ");
		}
		System.out.print(sb);
	}
	public static void main(String[] args) {
		
		List<Contact> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			printMenu();
			System.out.print("선택하세요: ");
			String s = sc.nextLine();
			switch (s) {
				case "1": {list.add(creatContact()); break;}
				case "2": {lookContact(list); break;}
				default: break;
			}
			if(s.equals("5")) break;
			System.out.println("1");
		}
		System.out.println("프로그램 종료");
		
		sc.close();
		
	}

}
