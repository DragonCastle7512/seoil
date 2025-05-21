package 람다식;

public class MyFunInterfaceExample03 {

	public static void main(String[] args) {

		MyFunInterface03 fi;
		fi = (a, b) -> {
			int result = a + b;
			return result;
		};
		System.out.println("7 + 7 = "+fi.method(7, 7));
		
		//return 생략
		fi = (a, b) -> a*b;
		System.out.println("7 * 7 = "+fi.method(7, 7));
	}
	public static int sum(int a, int b) {
		return a-b;
	}

}
