
public class BasicRef10 {

	static void change(int[] arr) {
		arr[0] = 1000;
		System.out.println("change() arr[0] = "+arr[0]);
	}
	public static void main(String[] args) {

		int[] arr = {10};
		System.out.println("main() arr[0] = "+arr[0]);
		change(arr);
		System.out.println("main() arr[0] = "+arr[0]);
	}

}
