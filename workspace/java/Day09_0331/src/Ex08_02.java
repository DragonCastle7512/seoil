import java.util.Random;

public class Ex08_02 {

	public static void main(String[] args) {
		
		int i = 0, sum = 0;
		while(++i <= 50) {
			if(i%3 == 0) continue;
			sum += i;
		}
		System.out.println(sum);
		
		for (;;) {
			Random r = new Random();
			int dice = r.nextInt(6)+1;
			System.out.println("임의의 주사위 눈 수="+dice);
			if(dice == 4) break;
		}
	}

}
