class Arr07 {
	void printArr(int[] arr) {
		for (int i : arr)
			System.out.print(i+" ");
		System.out.println();
	}
}

public class ObjectEx07 {

	public static void main(String[] args) {

		int[] numArr = new int[10];
		for (int i = 0; i < numArr.length; i++)
			numArr[i] = i+1;
		for (int i = 0; i < numArr.length; i++)
			System.out.printf("%d ", numArr[i]);
		System.out.println();
		for (int i : numArr)
			System.out.print(i+" ");
		System.out.println("\n====================");
		Arr07 arr = new Arr07();
		arr.printArr(numArr);
		arr.printArr(numArr);
	}

}
