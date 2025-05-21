
public class TryCatch02 {

	public static void main(String[] args) {

		int a = 10, b01 = 0, b02 = 2, c = 10;
		if(b02 == 0) System.out.println("예외 상황이 발생했습니다.");
		else System.out.println("c = "+ (c = a/b02));
		
		if(b01 == 0) System.out.println("예외 상황이 발생했습니다.");
		else System.out.println("c = "+(c = a/b01));
	}

}
