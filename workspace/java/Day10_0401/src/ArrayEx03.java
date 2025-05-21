
public class ArrayEx03 {

	public static void main(String[] args) {

		double[] data = {9.5, 7.0, 5.0, 10.0, 11.0, 13.0};
		double max = 0.0;
		for (int i = 0; i < data.length; i++)
			max =Math.max(max, data[i]);
		System.out.println("최댓값: "+max);
	}

}
