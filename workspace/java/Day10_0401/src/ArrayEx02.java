
public class ArrayEx02 {

	public static void main(String[] args) {
		
		int score[] = {100, 90, 80, 96, 100};
		int sum = 0;
		for (int i = 0; i < score.length; i++)
			sum += score[i];
		System.out.println("합계: "+sum+" 평균: "+(double)sum/score.length);
	}

}
