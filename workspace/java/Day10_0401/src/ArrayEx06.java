import java.util.Arrays;

public class ArrayEx06 {

	public static void main(String[] args) {

		int[] iArray01 = new int[10];
		int[] iArray02 = new int[] {100, 95, 80, 70, 100};
		int[] iArray03 = {100, 100, 85, 95, 90};
		char[] chArr = {'a', 'b', 'c', 'd'};
		for (int i = 0; i < iArray01.length; i++)
			System.out.println(iArray01[i] = i+1);
		System.out.println("=====================");
		for (int a:iArray02)
			System.out.print(a+" ");
		System.out.println("=====================");
		System.out.println(Arrays.toString(iArray03));
		System.out.println(chArr);
	}

}
