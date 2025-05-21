interface IHello11 {
	void hello(String name);
}
interface GoodBye11 {
	public abstract void bye(String name);
}
interface ITotal11 extends IHello11, GoodBye11 {
	void greeting(String name);
}
class SubClass11 implements ITotal11 {
	@Override
	public void hello(String name) {
		System.out.println(name+" 안녕~");
	}

	@Override
	public void bye(String name) {
		System.out.println(name+" 잘가~");
	}

	@Override
	public void greeting(String name) {
		System.out.println(name+" 반가워~");
	}
	
}
public class AbsEx11 {

	public static void main(String[] args) {

		SubClass11 sub = new SubClass11();
		sub.hello("ab");
		sub.bye("ab");
		sub.greeting("ab");
	}

}
