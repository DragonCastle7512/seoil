package 람다식;

public class MyFunInterfaceExample {

	public static void main(String[] args) {

		MyfunInterface fi;
		fi = () -> {
			String result = "method() call 01";
			System.out.println(result);
		};
		fi.method();
		
		fi = () -> System.out.println();
		fi.method();
	}

}
