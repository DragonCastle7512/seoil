
public class BreakEx05 {

	public static void main(String[] args) {
		
		int sum = 0, i = 0;
		while((sum += ++i) <= 100) {}
		System.out.println("i="+i+" sum="+sum);
		
		/*sum = i = 0;
		while(true)
			if((sum += ++i) > 100) break;
		System.out.println(i+" "+sum);*/
	}

}
