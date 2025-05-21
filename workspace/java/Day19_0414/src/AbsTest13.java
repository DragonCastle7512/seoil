abstract class Abs13 {
	abstract void pr();
}
class Child13 extends Abs13 {

	@Override
	void pr() {
		System.out.println("추상메서드를 오버라이딩한 일반메서드");
	}	
}

public class AbsTest13 {

	public static void main(String[] args) {

		Abs13 abs = new Child13();
		abs.pr();
	}

}
