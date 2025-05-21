
public class Ex07_03 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i+=2)
			System.out.print(i+" "+((i%20 == 0) ? "\n" : ""));
		System.out.println("\n ==============================");
		
		for (int i = 2; i <= 100; i++) {
			if(i%2 == 0) System.out.print(i+" ");
			if(i%20 == 0) System.out.println();
		}
	}

}
