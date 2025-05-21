
public class Member {

	private String name;
	private Integer id;
	public Member() {
		System.out.println("Member 실행");
	}
	public Member(Integer id) {
		System.out.println("Member(Integer id) 실행");
		this.id = id;
	}
	public Member(String name, Integer id) {
		System.out.println("Member(String name, Integer id) 실행");
		this.name = name;
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
}
