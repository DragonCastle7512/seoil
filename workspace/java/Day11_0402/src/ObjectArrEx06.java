
public class ObjectArrEx06 {

	public static void main(String[] args) {

		final int MAX_ROWS = 5;
		int[][] ragged = new int[MAX_ROWS+1][];
		for (int i = 0; i <= MAX_ROWS; i++)
			ragged[i] = new int[i+1];
		for (int i = 0; i < ragged.length; i++)
			for (int j = 0; j < ragged[i].length; j++)
				ragged[i][j] = j;
		for (int i = 0; i < ragged.length; i++) {
			for (int j = 0; j < ragged[i].length; j++)
				System.out.print(ragged[i][j]+" ");
			System.out.println();
		}
	}

}
