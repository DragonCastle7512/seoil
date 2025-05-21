
public class ObjectArrEx05 {

	public static void main(String[] args) {

		int[][] score = {
			{100, 100, 100},
			{20, 20, 20},
			{30, 30, 30},
			{40, 40, 40},
			{50, 50, 50}
		};
		int kor = 0, eng = 0, math = 0;
		System.out.println("번호	국어	영어	수학	총점	평균");
		System.out.println("========================");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0.0;
			
			kor += score[i][0];
			eng += score[i][1];
			math += score[i][2];
			System.out.printf("%3d", i+1);
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(double)score[i].length;
			System.out.printf("%5d %5.1f\n", sum, avg);
			System.out.println();
		}
		System.out.println("=========================");
		System.out.printf("총점: %3d %4d %d\n", kor, eng, math);
	}

}
