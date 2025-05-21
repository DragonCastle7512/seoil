import java.util.List;

public interface PhonebookInter {
	//기능 설계서(입력, 전체출력, 선택출력, 수정, 삭제)
	//입력 - 무엇이 필요한지 입력값으로 처리
	int insert(String name, String hp, String email);
	List<Phonebook> findAll();
	Phonebook findByHp(String hp);
	//이메일에 의해서 이름과 전화번호 수정
	int update(String email, String name, String hp);
	int delete(String email);
}
