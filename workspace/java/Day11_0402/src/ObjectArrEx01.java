
public class ObjectArrEx01 {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++)
			count[arr[i] = (int)(Math.random()*10)]++;
		for (int i = 0; i < count.length; i++)
			System.out.println(i+"의 개수: "+ count[i]+" ");
	}

}
