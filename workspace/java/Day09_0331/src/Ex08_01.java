
public class Ex08_01 {

	public static void main(String[] args) {

		int max = 0;
		for (int i = 1; i <= 100; i++)
			if(i%7 == 0) max = i;
		System.out.println(max);
		
		int i;
		for (i = 100; i >= 0; i--)
			if(i%6 == 0) break;
		System.out.println(i);
	}

}
