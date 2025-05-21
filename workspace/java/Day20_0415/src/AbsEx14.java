/* 클래스와 클래스 간 직접연결보다는 중간에 인터페이스를 끼어 넣는 것이 좋음 */
interface I14 {
	public abstract void play();
}
class A14 implements I14 {
	@Override
	public void play() {
		System.out.println("play in A14 class");
	}
}
class B14 implements I14 {
	@Override
	public void play() {
		System.out.println("play in B14 class");
	}
}
class C14 {
	void play(I14 i) {
		i.play();
	}
}
public class AbsEx14 {

	public static void main(String[] args) {

		C14 c14 = new C14();
		c14.play(new A14());
		c14.play(new B14());
	}

}
