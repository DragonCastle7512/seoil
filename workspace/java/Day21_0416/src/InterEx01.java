interface ParentInter01 {
	void absMethod();
	public default void defaultMethod() {
		System.out.println("디폴트 메서드");
	}
}
class ChildClass01 implements ParentInter01 {
	@Override
	public void absMethod() {
		System.out.println("추상메서드 오버라이딩");
	}
	//선택적 오버라이딩
	@Override
	public void defaultMethod() {
		System.out.println("자식 메소드 메서드");
	}
}
public class InterEx01 {

	public static void main(String[] args) {

		ChildClass01 c = new ChildClass01();
		c.absMethod();
		c.defaultMethod();
	}

}
