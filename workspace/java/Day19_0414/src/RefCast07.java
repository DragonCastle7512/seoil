class Car07 extends Object {
	
}
class FireEngine07 extends Car07 {
	
}
public class RefCast07 {

	public static void main(String[] args) {

		FireEngine07 fe = new FireEngine07();
		if(fe instanceof Car07) System.out.println("업캐스팅 가능");
		if(fe instanceof Object) System.out.println("업캐스팅 가능");
		Object obj = new FireEngine07();
		if(obj instanceof FireEngine07) {
			System.out.println("다운캐스팅 가능");
			FireEngine07 fe2 = (FireEngine07)obj;
		}
		else System.out.println("다운캐스팅 불가");
		
	}

}
