//non-sealed: 또 다른 자손클래스를 생성할 수 있음
public non-sealed class Manager extends Person {

	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}
