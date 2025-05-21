
public class BasicRef12 {

	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] result) {
		result[0] = a+b;
	}
	public static void main(String[] args) {

		BasicRef12 b = new BasicRef12();
		
		int re = b.add(3, 5);
		System.out.println("3 + 5 = "+re);
		
		int[] arr = {0};
		b.add(3, 5, arr);
		System.out.println(arr[0]);
	}

}
