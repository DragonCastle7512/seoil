package 람다식;

public class MyFunInterfaceExample02 {

	public static void main(String[] args) {

		MyFunInterface02 fi;
		fi = (var data) -> {
			int result = data*7;
			System.out.println(data+" x 7 = "+result);
		};
		fi.method(7);
		fi = x -> System.out.println(x +" + "+7+" = "+(x+7));
		fi.method(7);
	}

}
