import java.util.Scanner;

public class PhonebookMain {

	public static void main(String[] args) {

		PhonebookImp pbfunc = new PhonebookImp();
		while(true) {
			switch (pbfunc.menu()) {
				case 1:
					System.out.println("이름: ");
					String name = new Scanner(System.in).nextLine();
					System.out.println("전화 번호: ");
					String hp = new Scanner(System.in).nextLine();
					System.out.println("이메일: ");
					String email = new Scanner(System.in).nextLine();
					pbfunc.insert(name, hp, email);
					break;
				case 2:
					System.out.println("====================");
					for (Phonebook pb : pbfunc.findAll()) {
						System.out.println("이름: "+pb.getName());
						System.out.println("전화번호: "+pb.getHp());
						System.out.println("이메일: "+pb.getEmail());
					}
					System.out.println("====================");
					break;
				case 3:
					System.out.println("전화번호를 입력하여 이름찾기");
					System.out.print("전화번호 입력: ");
					String searchHp = new Scanner(System.in).nextLine();
					Phonebook pb = pbfunc.findByHp(searchHp);
					System.out.println("이름: "+pb.getName());
					System.out.println("전화번호: "+pb.getHp());
					System.out.println("이메일: "+pb.getEmail());
					break;
				case 4: 
					System.out.println("수정할 이메일: ");
					String changeEmail = new Scanner(System.in).nextLine();
					System.out.println("수정된 이름: ");
					String changeName = new Scanner(System.in).nextLine();
					System.out.println("수정된 전화번호: ");
					String changeHp = new Scanner(System.in).nextLine();
					pbfunc.update(changeEmail, changeName, changeHp);
					break;
				case 5:
					System.out.println("삭제할 정보(이메일로 입력): ");
					pbfunc.delete(new Scanner(System.in).nextLine());
					break;
			}
		}
	}

}
