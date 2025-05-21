
public class InterEx06 {

	public static void main(String[] args) {

		int n01 = 10;
		int n02;
		Integer num01;
		Integer num02 = new Integer(20);
		num01 = n01;
		System.out.println("오토박싱 된 값"+num01);
		
		n02 = num02;
		System.out.println("오토언박싱 된 값="+n02);
	}

}
