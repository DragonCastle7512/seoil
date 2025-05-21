
public class InterEx04 {

	public static void main(String[] args) {

		ImpClass impl = new ImpClass();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println("\n=======================");
		
		InterfaceB ib = impl;
		ib.methodA();
		ib.methodB();
		System.out.println("\n=======================");
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
