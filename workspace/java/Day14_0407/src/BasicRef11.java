
public class BasicRef11 {

	static void printArr(int[] arr) {
		int cnt = 0;
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i);
			if(++cnt == arr.length) continue;
			System.out.print(", ");
		}
		System.out.println("]");
	}
	static int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
	public static void main(String[] args) {

		int[] arr = {3, 2, 1, 6, 5, 4};
		printArr(arr);
		int total = sumArr(arr);
		System.out.println("총합: "+total);
	}

}
