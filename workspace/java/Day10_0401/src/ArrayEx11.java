import java.util.Arrays;

public class ArrayEx11 {

	public static void main(String[] args) {

		int[] score = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random()*score.length);
			arr[i] = score[r];
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n=====================");
		for (int i : arr)
			System.out.print(i+" ");
	}

}
