
public class Ex07_01 {

	public static void main(String[] args) {
		
		int sum = 0, cnt = 0;
		for (int i = 22; i <= 76; i+=2, cnt++)
			sum += i;
		System.out.println("합계: "+sum+", 개수: "+cnt);
		
		sum = cnt = 0;
		for (int i = 22; i <= 76; i++) {
			if(i%2 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("합계: "+sum+", 개수: "+cnt);
	}

}
