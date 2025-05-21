import java.util.*;
import java.util.stream.IntStream;

public class FromIntRangeExample {

	static int sum = 0;
	public static void main(String[] args) {
	
		IntStream.rangeClosed(1, 100).forEach(x -> sum += x);
		System.out.println(sum);
		System.out.println(IntStream.rangeClosed(1, 100).sum());
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*10)+1);
			System.out.println(list.get(i));
		}
		sum = 0;
		for (Integer i : list)
			sum += i;
		System.out.println(sum);
	}

}
