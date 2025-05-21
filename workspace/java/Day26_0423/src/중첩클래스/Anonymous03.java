package 중첩클래스;

public class Anonymous03 {

	private int field;
	public void method(int arg01, int arg02) {
		int var01 = 0;
		int var02 = 0;
		field = 10;
		
		//final 속성이기 때문에 수정 불가
		//arg01 = 10;
		//arg02 = 20;		
		//var01 = 10;
		//var02 = 20;
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int res = arg01 + arg02 + var01 + var02 + field;
				return 0;
			}
		};
		System.out.println("계산 결과값="+calc.sum());
	}
}
