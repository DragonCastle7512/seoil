
public class ArrayEx01 {

	public static void main(String[] args) {
		
		int score[] = new int[5];
		score[0] = 100;
		score[1] = 90;
		score[2] = 99;
		score[3] = 80;
		score[4] = 97;
		System.out.printf("배열크기 =%d\n", score.length);
		for (int i = 0; i < score.length; i++)
			System.out.println(score[i]);
	}

}
