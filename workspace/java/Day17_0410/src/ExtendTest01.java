class Parent01 {
	public void parentPrn() {
		System.out.println("부모클래스 매서드 parentPrn()");
	}
}
class Child01 extends Parent01 {
	public void childPrn() {
		System.out.println("자손클래스 매서드 childPrn()");
	}
}
public class ExtendTest01 {

	public static void main(String[] args) {
		
		Child01 child = new Child01();
		child.parentPrn();
		child.childPrn();
		System.out.println("\n=======================");
		Parent01 p = new Parent01();
		p.parentPrn();
	}

}
