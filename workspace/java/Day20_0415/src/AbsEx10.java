interface IHello10 {
	public abstract void sayHello(String name);
}
abstract class GoodBye10 {
	public abstract void sayGoodBye(String name);
}
class SubClass10 extends GoodBye10 implements IHello10 {

	@Override
	public void sayHello(String name) {
	}

	@Override
	public void sayGoodBye(String name) {
	}
	
}
public class AbsEx10 {

	public static void main(String[] args) {

	}

}
