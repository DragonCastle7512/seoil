class Mother01 {
	public void m01() {
		System.out.println("부모클래스 메서드");
	}
}
class Child01 extends Mother01{
	public void ch01() {
		System.out.println("자손클래스 메서드");
	}
}
public class RefCast01 {

	public static void main(String[] args) {

		Child01 ch01 = new Child01();
		ch01.m01();
		ch01.ch01();
		Mother01 m01 = new Mother01();
		//다운캐스팅
		m01=ch01;
		m01.m01();
		
		//업캐스팅
		Mother01 m02 = new Child01();
		m02.m01();
	}

}
