class SubClass {
	int i = 3;
}
public class Ex17_01 {

	public static void main(String[] args) {

		Object o = new SubClass();
		if(o instanceof SubClass) {
			SubClass foo = (SubClass)o;
			System.out.println("i="+foo.i);
		}
	}

}
