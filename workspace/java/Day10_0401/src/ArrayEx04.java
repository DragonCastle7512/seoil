
public class ArrayEx04 {

	public static void main(String[] args) {

		int[][] score = new int[3][2];
		
		score[0][0] = 10; score[0][1] = 20;
		score[1][0] = 30; score[1][1] = 40;
		score[2][0] = 50; score[2][1] = 60;
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++)
				System.out.println(score[i][j]+" ");
			System.out.println();
		}
	}

}
