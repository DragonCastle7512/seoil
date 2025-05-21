package 람다식;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;
		
		//상수로 인식
		//arg = 31;
		//localVar = 41;
		
		MyFunInterface05 fi = () -> {
			System.out.println("arg="+arg);
			System.out.println("localVar="+localVar);
		};
		fi.method();
	}
}