class Bass {
	public Bass() {
		System.out.println("Base");
	}
}
class Alpha extends Bass {}
public class Ex16_06 {

	public static void main(String[] args) {

		new Alpha();
		new Bass();
	}

}
