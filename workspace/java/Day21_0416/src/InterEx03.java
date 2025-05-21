class ParentClass03 {
	public void display() {
		System.out.println("부모클래스 일반 메서드");
	}
}
interface ParentInter03 {
	default void display() {
		System.out.println("부모 인터페이스의 대폴트 메서드");
	}
}
class ChildClass03 extends ParentClass03 implements ParentInter03 {
	
}

public class InterEx03 {

	public static void main(String[] args) {

		ChildClass03 child03 = new ChildClass03();
		child03.display();
	}

}
