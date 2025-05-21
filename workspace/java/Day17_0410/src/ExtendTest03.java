class Parent03 {
	public void p03() {
		System.out.println("부모의 매서드 p03()");
	}
}
class Child03 extends Parent03 {
	@Override
	//부모클래스 매서드를 호출
	public void p03() {
		super.p03();
		System.out.println("오버라이딩한 매서드");
	}
	public void ch03() {
		System.out.println("ch03()");
	}
}
public class ExtendTest03 {

	public static void main(String[] args) {

		Child03 ch03 = new Child03();
		ch03.p03();
		ch03.ch03();
		
		Parent03 p03 = new Parent03();
		p03.p03();
	}

}
