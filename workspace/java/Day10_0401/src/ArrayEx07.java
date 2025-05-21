
public class ArrayEx07 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i+1;
		System.out.println("변경전 배열 크기: "+arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.println("arr["+i+"] : "+arr[i]);
		
		int[] tmp = new int[arr.length*2];
		for (int i = 0; i < arr.length; i++)
			tmp[i] = arr[i];
		arr = tmp;
		System.out.println("변경후 배열 크기: "+arr.length);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		for (int i : arr)
			System.out.print(i+" ");
	}

}
