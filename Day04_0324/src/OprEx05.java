
public class OprEx05 {

	public static void main(String[] args) {
		
		int i = 5, j = 0;
		j = i++;
		System.out.printf("i=%d, j=%d\n", i, j);
		
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("i="+i+", j="+j);
		
		i = 5;
		j = 5;
		System.out.printf("i++=%d\n", i++);
		System.out.printf("i=%d\n", i);
		System.out.printf("++j=%d\n", ++j);
	}

}
