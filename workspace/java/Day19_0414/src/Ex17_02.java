class Super {
	public int getNumber(int a) {
		return a+1;
	}
}
class Sub extends Super {
	public int getNumber(int a) {
		return a+2;
	}
}
public class Ex17_02 {

	public static void main(String[] args) {
		
		Super a = new Sub();
		System.out.println(a.getNumber(0));
	}

}
