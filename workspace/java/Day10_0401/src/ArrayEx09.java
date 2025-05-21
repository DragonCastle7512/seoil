
public class ArrayEx09 {

	public static void main(String[] args) {
		
		int[] score = {95, 96, 97, 93, 92};
		int max = score[0], min = score[0];
		/*for (int i = 0; i < score.length; i++) {
			min = Math.min(min, score[i]);
			max = Math.max(max, score[i]);
		}*/
		for (int i = 0; i < score.length; i++) {
			if(min > score[i]) min = score[i];
			else if(max < score[i]) max = score[i];
		}
		System.out.println("최솟값: "+min+", 최댓값: "+max);
	}

}
