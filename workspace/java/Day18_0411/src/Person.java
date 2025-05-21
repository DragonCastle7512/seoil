/* sealed 키워드: 무분별한 자손 클래스 생성을 방지
 * permits 이후의 자손 클래스를 반드시 만들어줘야하고, 이외의 자손클래스는 상속 불가능
 */
public sealed class Person permits Employee, Manager {

	private String name;
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
