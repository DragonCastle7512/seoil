interface IHello09 {
	void sayHello(String name);
}
interface IGoodBye09 {
	public abstract void sayGoodBye(String name);
}
class SubClass09 implements IHello09, IGoodBye09 {

	@Override
	public void sayHello(String name) {
		System.out.println("hello");
	}
	@Override
	public void sayGoodBye(String name) {
		System.out.println("goodbye");
	}	
}

public class AbsEx09 {

	public static void main(String[] args) {

	}

}
