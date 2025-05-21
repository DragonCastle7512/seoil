
public class ArrayEx08 {

	public static void main(String[] args) {

		int sum = 0;
		int[] score = {100, 88, 100, 100, 90};
		for (int i : score)
			sum += i;
		System.out.println("합계: "+sum+", 평균: "+(double)sum/score.length);
	}

}
