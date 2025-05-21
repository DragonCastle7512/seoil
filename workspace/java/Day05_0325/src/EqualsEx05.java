import java.util.Scanner;

public class EqualsEx05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num < 0)
			num = -num;
		System.out.println("절대값 = "+num);
	}

}
