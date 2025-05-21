
public class GuardEx04 {

	public static void main(String[] args) {
		
		int i;
		for (i = 1; i <= 10; i++)
			System.out.println("Hello Java!");
		System.out.println("\n ================> \n");
		for (i = 1; i <= 5; i++)
			System.out.print(i+"\t");
		System.out.println("\n ================>\n");
		for (i = 2; i <= 10; i+=2)
			System.out.println(" "+i);
		System.out.println("\n ================>\n");
		for (i = 5; i >= 1; i--)
			System.out.println(" "+i);
	}

}
