package 람다식;

public class UsingThis {

	private int outterField = 10;
	class Inner {
		int innerField = 20;
		void method() {
			MyFunInterfave04 fi = () -> {
				System.out.println(outterField);
				System.out.println(UsingThis.this.outterField);
				
				System.out.println(innerField);
				System.out.println(this.innerField);
			};
			fi.method();
		}
	}
}
