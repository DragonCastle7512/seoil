/* 인터페이스
 * 1. 하나 이상의 부모로 부터 다중 상속 가능
 * 2. 인터페이스에 오는 추상 메서드는 public abstract 키워드(생략 가능)
 * 3. 부모의 모든 추상메서드를 반드시 구현해야한다. 
 */
interface IHello07 {
	void sayHello (String name);
}
class Hello07 implements IHello07 {
	@Override
	public void sayHello(String name) {
		System.out.println(name+"씨 안녕");
	}
}
public class AbsEx07 {

	public static void main(String[] args) {

		Hello07 h = new Hello07();
		h.sayHello("홍길동");
		IHello07 ih = new Hello07();
		ih.sayHello("이순신");
	}

}
