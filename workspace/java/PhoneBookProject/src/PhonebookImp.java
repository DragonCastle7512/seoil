import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhonebookImp implements PhonebookInter {

	//String[] sarray;
	//Phonebook[] arr;
	List<Phonebook> list;
	public PhonebookImp() {
		list = new ArrayList<>();
	}
	@Override
	public int insert(String name, String hp, String email) {
		/*	오류 발생
		 *	1. 입력값 중 하나이상이 null 값일 때
		 *	2. 입력값이 정규식에 일치하지 않을 때
		 */
		if(name == null || hp == null || email == null) {
			System.out.println("입력값 중 null값이 밠생하여 중지");
			return 1;
		}
		String regex = "^010-\\d{4}-\\d{4}$";
		if(!hp.matches(regex)) {
			System.out.println("유효한 전화번호가 아님");
			return 1;
		}
		Phonebook pb = new Phonebook(name, hp, email);
		list.add(pb);
		return 0;
	}

	@Override
	public List<Phonebook> findAll() {
		return list;
	}
	//한명 찾기
	@Override
	public Phonebook findByHp(String hp) {
		for (Phonebook pb : list)
			if(pb.getHp().equals(hp)) return pb;
		return null;
	}
	//여러명 찾기
	public List<Phonebook> findByName(String name) {
		List<Phonebook> list = new ArrayList<>();
		for (Phonebook pb : list)
			if(pb.getName().equals(name))
				list.add(pb);
		return list;
	}

	@Override
	public int update(String email, String name, String hp) {
		for (Phonebook pb : list) {
			if(pb.getEmail().equals(email)) {
				pb.setName(name);
				pb.setHp(hp);
				return 0;
			}
		}
		return 1;
	}

	@Override
	public int delete(String email) {
		for (Phonebook ph : list) {
			if(ph.getEmail().equals(email)) {
				list.remove(ph);
				return 0;
			}
		}
		return 1;
	}
	public int menu() {
		System.out.println("========MENU========");
		System.out.println("1. 입력");
		System.out.println("2. 전체 출력");
		System.out.println("3. 선택 출력");
		System.out.println("4. 수정");
		System.out.println("5. 삭제");
		System.out.println("====================");
		int sel = new Scanner(System.in).nextInt();
		return sel;
	}

}
