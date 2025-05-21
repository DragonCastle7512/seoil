
public class VarTest04 {

	public static void main(String[] args) {
		
		int year = 2025;
		int age = 25;
		System.out.printf("년도: %s%n", year); //%n 줄바꿈
		System.out.printf("나이: %s\n", age);
		
		year = age + 2000;
		age = age+1;
		System.out.println("년도: "+year+", 나이: "+age);
		System.out.println("\n ===================> \n");
		
		int x = 10;
		int y = 20;
		int temp = 0;
		System.err.println("x="+x+", y="+y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("x="+x+", y="+y);
		
	}

}
