
public class BreakEx04 {

	public static void main(String[] args) {
		int i=0;
		while(true) {
			System.out.print(i+"번Spring\t");
			if(++i >= 10) break;
		}
		System.out.println(i+"번End");
		
		System.out.println("\n===========================");
		i=0;
		for (;;) {
			System.out.print(i+"번노란개나리\t");
			if(++i >= 10) break;
		}System.out.println(i+"번끝");
	}

}
